package arquivando;
import java.io.*;
import java.io.IOException;
import java.util.Scanner;
public class Arquivando {
    public static void main(String[] args) throws IOException{
        String digitado, texto;
        Scanner entrada = new Scanner (System.in);
        File arq = new File("arquivo.txt");
            long tam = arq.length();
            int t = (int) tam;
            char CARACTERE[] = new char[t];
        try{
            FileWriter ARQ = new FileWriter ("arquivo.txt");
            System.out.println("Oque deseja que seja escrito no seu arquivo? ");
            digitado = entrada.nextLine();
            ARQ.write(digitado+"\r\n");
            ARQ.write("Hoje é dia de Enem\r\n"+"E amanhã tambem");
            ARQ.close();
            FileReader ARQtexto = new FileReader ("arquivo.txt");
            ARQtexto.read(CARACTERE);
            ARQtexto.close();
            texto = String.valueOf(CARACTERE);
            System.out.println(texto);
        }catch(IOException ioe){
            System.out.println("Arquivo não pode ser escrito");
            System.out.println(ioe);
        }
    }
}