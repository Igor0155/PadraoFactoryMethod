package factorymethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PagamentoFactoryTest {

    @Test
    void deveRetornarExcecaoParaPagamentoInexistente() {
        IllegalArgumentException excecao = assertThrows(IllegalArgumentException.class, () -> {
            PagamentoFactory.obterPagamento("Boleto");
        });
        assertEquals("Método de pagamento inexistente", excecao.getMessage());
    }

    @Test
    void deveRetornarExcecaoParaPagamentoInvalido() {

        // IPagamento
        IllegalArgumentException excecao = assertThrows(IllegalArgumentException.class, () -> {
            PagamentoFactory.obterPagamento("Dinheiro");
        });
        assertEquals("Método de pagamento inválido", excecao.getMessage());
    }

    @Test
    void deveProcessarPagamentoPix() {
        IPagamento pagamento = PagamentoFactory.obterPagamento("Pix");
        assertEquals("Pagamento via PIX processado com sucesso", pagamento.processar());
    }

    @Test
    void deveEstornarPagamentoCartao() {
        IPagamento pagamento = PagamentoFactory.obterPagamento("Cartao");
        assertEquals("Estorno no Cartão de Crédito solicitado", pagamento.estornar());
    }
}
