package operações;
import java.util.Scanner;
public class Contas {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        Operacoes o = new Operacoes();
        int resultado, x;
        System.out.println("Digite 1->Fatorial ou 2->Exponencial ou 3->Soma: ");
        x = s.nextInt();
        switch (x){
            case 1:
                int num;
                System.out.println("Informe o número à ser fatorado: ");
                num = s.nextInt();
                resultado = o.fatorial(num);
                System.out.println("O fatorial de "+num+" = "+resultado);
                break;
            case 2:
                int b, e;
                System.out.println("Digite o valor da base: ");
                b = s.nextInt();
                System.out.println("Digite o valor do exponencial: ");
                e = s.nextInt();
                resultado = o.potencia(b,e);
                System.out.println("A pontencia de "+b+" elevado à "+e+" = "+resultado);
                break;
            case 3:
                int [] vetor = new int[3];
                int i;
                System.out.println("Preencha o vetor com 3 números que serão somados: ");
                for (i=0; i<vetor.length; i++){
                    vetor[i]=s.nextInt();
                }
                resultado = o.soma(vetor, 0);
                System.out.println("A soma entre "+vetor[0]+"+"+vetor[1]+"+"+vetor[2]+" = "+resultado);
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}