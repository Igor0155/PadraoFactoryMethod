package factorymethod;

public class PagamentoFactory {
    public static IPagamento obterPagamento(String metodo) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("factorymethod.Pagamento" + metodo);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Método de pagamento inexistente");
        }
        if (!(objeto instanceof IPagamento)) {
            throw new IllegalArgumentException("Método de pagamento inválido");
        }
        return (IPagamento) objeto;
    }
}
