import java.util.ArrayList;
import java.util.Iterator;

public class TesteIterator {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("java");
        nomes.add("ruby");
        nomes.add("scala");

        Iterator<String> it = nomes.iterator();
        
        while(it.hasNext()){
            String atual = it.next();
            System.out.println(atual);
            //it.remove();
        }
        System.out.println(nomes.size());

        for(String nome : nomes){
            System.out.println(nome);
        }
    }
}
