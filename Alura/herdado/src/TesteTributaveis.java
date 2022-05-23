public class TesteTributaveis {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(222, 3333);
        cc.deposita(100);

        SeguroVida seguro = new SeguroVida();

        CalculadorImposto calcula = new CalculadorImposto();
        calcula.registra(cc);
        calcula.registra(seguro);

        System.out.println(calcula.getTotalImposto());

    }
}
