public class TesteFuncionario {
    public static void main(String[] args) throws Exception 
    {
        Funcionario eu = new Gerente(); //new Funcionario();
        eu.setName("Ra");
        eu.setCpf("123.456.789-10");
        eu.setSalario(2600);
        System.out.println(eu.getName());
        System.out.println(eu.getBonificacao());

        Gerente g = new Gerente();
        g.setName("name");
        g.setSalario(5000);
        System.out.println(g.getName());
        System.out.println(g.getBonificacao());

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g);
        controle.registra(eu);
        System.out.println(controle.getSoma());

    }
}
