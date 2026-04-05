package factorymethod;

public class PagamentoPix implements IPagamento {

    public String processar() {
        return "Pagamento via PIX processado com sucesso";
    }

    public String estornar() {
        return "Pagamento via PIX estornado";
    }
}