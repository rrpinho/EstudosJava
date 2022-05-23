package operações;
public class Operacoes {
    public int fatorial (int num){
        if (num<=0)
            return 1;
        else
            return(fatorial(num-1)*num);
    }
    public int potencia(int num, int expoente){
        if(expoente<=0)
            return 1;
        else
            return(num*potencia(num, expoente-1));
    }
    public int soma(int [] vetor, int posicao){
        int tamanho = vetor.length;
        if (posicao>=tamanho)
            return 0;
        else
            return(vetor[posicao] + soma(vetor, posicao+1));
    }
}