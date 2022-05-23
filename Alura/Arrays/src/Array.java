import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        
        ArrayList lista = new ArrayList();

        Conta cc = new ContaCorrente(111, 222);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(211, 322);
        lista.add(cc2);

        System.out.println(lista.size());

        Conta ref = (Conta) lista.get(0);
        System.out.println(ref.getNumero());

        lista.remove(0);
        System.out.println(lista.size());

        Conta cc3 = new ContaCorrente(311, 422);
        lista.add(cc3);

        Conta cc4 = new ContaCorrente(411, 522);
        lista.add(cc4);

        for (int i = 0; i < lista.size(); i++){
            Object oRef = lista.get(i);
            System.out.println(oRef);
        }
        System.out.println();
        for (Object oRef: lista){
            System.out.println(oRef);
        }

        ArrayList<Conta> lista2 = new ArrayList<Conta>(); //Nesse Array, só será armazenado dados do tipo "Conta".

        ContaPoupanca conta = new ContaPoupanca(12, 321);
        lista2.add(conta);
        lista2.add(new ContaPoupanca(45, 654));

        System.out.println(lista2.size());

        ArrayList lista3 = new ArrayList(lista);
        System.out.println(lista3.size());

        ArrayList lista4 = new ArrayList(26);
        System.out.println(lista4.size());



        


    }
}
