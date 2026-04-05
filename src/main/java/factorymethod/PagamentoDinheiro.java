package factorymethod;

public class PagamentoDinheiro {

    public String processar() {
        return "Pagamento em Dinheiro recebido";
    }

    public String estornar() {
        return "Troco devolvido em Dinheiro";
    }
}
