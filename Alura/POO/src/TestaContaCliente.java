public class TestaContaCliente {
    /*public static void main(String[] args) {
        Cliente client = new Cliente();
        client.nome = "meu nome";
        client.cpf = "222.222.222-22";
        client.profissao = "aquilo la";

        Conta conta = new Conta();
        conta.deposita(1000);

        conta.titular = client;
        System.out.println(conta.titular.nome);
    }*/

    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.titular = new Cliente();
        
    }
}
