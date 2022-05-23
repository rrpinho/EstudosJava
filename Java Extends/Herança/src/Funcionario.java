public class Funcionario { //Pai
   String nome;
   float salario;
   public void setNome(String n){
       this.nome = n;
   }
   public String getNome(){
       return this.nome;
   }
   public void salario(int quantidadeVendas){
       this.salario = (float) (quantidadeVendas + ((float)quantidadeVendas*0.20));
   }
   public float getSalario(){
       return this.salario;
   }
}