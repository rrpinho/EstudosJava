public abstract class Conta implements Comparable<Conta>
{
    private double saldo; //atributo
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int cont = 0;
    //Cliente titura = new Cliente();

    public Conta(int agencia, int numero){ //Construtor que por padrão fica invisível e sem parâmetro. Executa na criação do objeto: new Conta();
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Criando uma conta");
    }

    /*public Conta(int numero){
        this(1337, numero);
    }

    public Conta(){
        Conta.cont++;
        System.out.println("A quantidade de contas é: " + Conta.cont);
    }*/


    public void deposita(double valor){
        this.saldo += valor;
    }

    public void sacar(double valor){
        if(this.saldo < valor)
            throw new ExcecaoSaldoInsuficiente("Saldo: "+ this.saldo + ", Valor: "+ valor);
        else
            this.saldo -= valor;
    }

    public void transferir(double valor, Conta conta){
        this.sacar(valor);
        conta.deposita(valor);
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public void setAgencia(int agencia){
        if (agencia <= 0){
            System.out.println("não pode valor negativo");
            return;
        }
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0){
            System.out.println("não pode valor negativo");
            return;
        }
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getCont() {
        return Conta.cont;
    }

    @Override
    public String toString() {
        return "Numero: " + this.numero + ", Agencia: " + this.agencia + " - Saldo: " + this.saldo;
    }

    @Override
    public int compareTo(Conta outra) {
        return Double.compare(this.saldo, outra.saldo);
    }
}
