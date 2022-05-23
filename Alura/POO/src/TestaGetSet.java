public class TestaGetSet {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setNumero(1337);
        System.out.println(conta.getNumero());

        Cliente cliente = new Cliente();
        cliente.setNome("meu nome");

        conta.setTitular(cliente);
        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("prof");
        System.out.println(conta.getTitular().getProfissao());

        System.out.println(Conta.getCont());
    }
}
