public class CriaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.deposita(200);
        System.out.println(primeiraConta.getSaldo());

        Conta segundaConta = primeiraConta; //No JAVA, a variável recebe uma referência da primeira. Então são 2 variáveis apontando para a mesma conta.
        System.out.println(segundaConta.getSaldo());
        
        segundaConta.deposita(100);
        System.out.println(segundaConta.getSaldo());
        System.out.println(primeiraConta.getSaldo());
    }
}
