public class TestaConexao {
    public static void main(String[] args) {
        
        Conexao con = null;
        try {
            con = new Conexao();
            con.leDados();
            //con.fecha();
        } catch (Exception e) {
            System.out.println("Deu erro:" + e);
            //con.fecha();
        } finally{
            con.fecha();
        }
    }
}
