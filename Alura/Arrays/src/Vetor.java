
public class Vetor {
    public static void main(String[] args) throws Exception {

        int[] idades = new int[5]; //Já inicializa Arrays com valores padrões. (int -> 0)

        /*idades[0] = 29;
        idades[1] = 39;
        idades[2] = 49;
        idades[3] = 59;
        idades[4] = 69;*/
        int[] id = {29,39,49,59,69};

        for (int i = 0; i < idades.length; i++){
            idades[i] = i*i;
            System.out.println(idades[i] + " \t "+ id[i]);
        }

        Conta[] conta = new Conta[5];

        ContaCorrente cc1 = new ContaCorrente(1111, 2222);
        cc1.deposita(200);
        conta[0] = cc1;

        ContaPoupanca cp1 = new ContaPoupanca(3333,4444);
        cp1.deposita(50);
        conta[1] = cp1;


        System.out.println(conta[0].getSaldo());
        System.out.println(conta[1].getSaldo());

        cc1.deposita(100);
        System.out.println(conta[0].getSaldo()); //Em conta possui uma referência para o objeto, ou seja, se modificar algo em "cc1", em "conta[0] também será modificado"

        String batata = "batata";
        System.out.println((int) batata.charAt(2) - 48);
        System.out.println(batata.length());
    
    }
}
