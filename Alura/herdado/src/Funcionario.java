//Não se pode instanciar objetos dessa classe, agora ela é abstrata.
public abstract class Funcionario { //abstract impede que eu crie uma variável deste tipo. Pois um Funcionário que é APENAS funcionário não existe, ele vai ter um cargo
    private String name;
    private String cpf;
    private double salario; //protected => Private mas também acessível para o "filhos", oque que estão herdando esta classe

    public abstract double getBonificacao(); //Esse método precisa existir para as classes filhas. MAS como não haverá um objeto Funcionário, então o método também é abstrata.
        //return this.salario*0.1;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
