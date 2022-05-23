public class AutenticacaoUtil {
    
    private String senha;

    
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean autentica(String senha) {
        if (this.senha.equals(senha))
            return true;
        else
            return false;
    }

}
