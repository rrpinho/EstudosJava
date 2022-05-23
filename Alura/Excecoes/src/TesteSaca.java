public class TesteSaca {
    public static void main(String[] args) {
        Conta conta = new ContaCorrente(123, 321);

        conta.deposita(200.0);
        try{
            conta.sacar(200.0);
        }catch(ExcecaoSaldoInsuficiente ex){
            System.out.println(ex.getMessage());
        }
        System.out.println(conta.getSaldo());
    }
}
