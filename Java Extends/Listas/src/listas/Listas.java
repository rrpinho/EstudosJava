package listas;
import java.util.ArrayList;
public class Listas {
 public static void main(String[] args) {
     ArrayList<String> nomes = new ArrayList<String>();
     ArrayList<String> clone = new ArrayList<String>();
     nomes.add("Carlos");
     nomes.add("Marcia");
     nomes.add("Leandro");
     nomes.add("Isis");
     if(nomes.contains("Leandro"))
         System.out.println("Tem esse elemento");
     nomes.remove("Carlos");
     if(nomes.contains("Carlos"))
         System.out.println("Tem esse elemento");
     else
         System.out.println("Não possui esse elemento");
     for(String n:nomes)
         System.out.println(n);
     System.out.println("###############################");
     if(clone.isEmpty())
         System.out.println("Está vazia");
     clone.addAll(nomes);
     clone.remove("Leandro");
     for(String n:clone)
         System.out.println(n);
    }
}