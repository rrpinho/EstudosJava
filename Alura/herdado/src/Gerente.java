public class Gerente extends Funcionario implements Autenticavel {

    private AutenticacaoUtil autenticador;

    public Gerente(){

        this.autenticador = new AutenticacaoUtil();
    }

    public double getBonificacao(){
        //return super.getBonificacao() + super.getSalario(); //super => Mesma coisa que o "this" mas indica que o atributo é da "super classe/ Base classe / Classe mãe"
        return super.getSalario();
    }

    @Override
    public void setSenha(String senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(String senha) {
        return this.autenticador.autentica(senha);
    }

}
