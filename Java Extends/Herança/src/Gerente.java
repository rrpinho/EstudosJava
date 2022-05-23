public class Gerente extends Funcionario { //Estar herdando os comandos da função "Funcionario"
    String nome;
    String senha = "123456789";
    @Override
    public void salario (int quantidadeVendas){
        this.salario = (float) (quantidadeVendas + ((float)quantidadeVendas*0.35));
    }
    public boolean autentica (String s){
        if(s.equals(this.senha)){
            System.out.println("Acesso Permitido");
            return true;
        }else{
            System.out.println("Acesso Negado");
            return false;
        }
    }
}