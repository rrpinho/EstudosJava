public class ControleBonificacao {

    private double soma;

    public void registra (Funcionario f){ //Polimorfismo. Usa o tipo da variável generica (classe mãe) mas ele vai aplicar a bonificação específica de cada tipo de funcionario
        this.soma += f.getBonificacao();
    }

    public double getSoma() {
        return soma;
    }

}
