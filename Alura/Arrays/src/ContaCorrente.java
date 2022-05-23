public class ContaCorrente extends Conta
{
    public ContaCorrente(int agencia, int numero)
    {
        super(agencia,numero);
    }

    @Override //Indica que estou sobrescrevendo um método da classe mãe.
    public void sacar(double valor) {
        super.sacar(valor + 0.2);
    }

    @Override
    public void deposita(double valor) {
        super.deposita(valor);
    }

}
