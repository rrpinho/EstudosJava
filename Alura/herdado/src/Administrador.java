public class Administrador implements Autenticavel { // Quando se puxa de uma interface, se usa o "implements" ao invés de "extends". Pode haver múltiplos "implements".

    private AutenticacaoUtil autenticador;

    public Administrador(){

        this.autenticador = new AutenticacaoUtil();
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
