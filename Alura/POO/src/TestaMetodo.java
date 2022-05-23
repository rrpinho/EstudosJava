public class TestaMetodo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.deposita(100);
        conta.deposita(50);
        System.out.println(conta.getSaldo());

        boolean conseguiu = conta.sacar(100);
        System.out.println(conta.getSaldo());
        System.out.println(conseguiu);

        Conta novaConta = new Conta();
        novaConta.deposita(1000);
        if(novaConta.transferir(200, conta)){
            System.out.println(conta.getSaldo());
            System.out.println(novaConta.getSaldo());
        } else
            System.out.println("Não foi possível realizar esta transferência");
    }
}
