public class Loja {
    public static void main (String [] args){
        Funcionario F1 = new Funcionario();
        F1.setNome("Rafael");
        F1.salario(100);
        System.out.println(F1.getNome());
        System.out.println(F1.getSalario());
        
        Gerente G1 = new Gerente();
        G1.setNome("Pinho");
        G1.salario(100);
        System.out.println(G1.getNome());
        System.out.println(G1.getSalario());
        G1.autentica("123456789");
    }
}