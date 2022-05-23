public class ContaCorrente extends Conta implements Tributavel
{
    public ContaCorrente(int agencia, int numero)
    {
        super(agencia,numero);
    }

    @Override //Indica que estou sobrescrevendo um método da classe mãe.
    public boolean sacar(double valor) {
        return super.sacar(valor + 0.2);
    }

    @Override
    public double getValorImposto() {
        return super.getSaldo() * 0.01;
    }

}
