package factorymethod;

public class PagamentoCartao implements IPagamento {

    public String processar() {
        return "Pagamento via Cartão de Crédito aprovado";
    }

    public String estornar() {
        return "Estorno no Cartão de Crédito solicitado";
    }
}