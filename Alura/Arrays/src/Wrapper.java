import java.util.ArrayList;
import java.util.List;

public class Wrapper 
{
    public static void main(String[] args) 
    {
        Integer idade = Integer.valueOf(22); //autoboxing
        System.out.println(idade.intValue()); //unboxing

        System.out.println(idade.MAX_VALUE);
        System.out.println(idade.SIZE);
        System.out.println(idade.BYTES);
        
        Double dRef = Double.valueOf(3.2);
        System.out.println(dRef.doubleValue());

        Boolean bRef = Boolean.FALSE;
        System.out.println(bRef.booleanValue());

        Number refNumero = Float.valueOf(29.9f);
        System.out.println(refNumero);

        List<Number> lista = new ArrayList<>();
        lista.add(10);
        lista.add(32.6);
        lista.add(25.6f);

    }
}
