import java.util.Date;
import java.util.Calendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Datas {
    public static void main(String[] args) throws Exception {
        Date data = new Date();
        System.out.println(data);

        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH)+1); // Mês vai de 0 a 11
        System.out.println(c.get(Calendar.DAY_OF_MONTH));

        Date da = c.getTime();
        System.out.println(da);  //Data do JAVA (DiaDaSemana Mês DiaDoMes hh:mm:ss Fuso Ano)
        DateFormat format = DateFormat.getDateInstance();
        System.out.println(format.format(da));  // Somente Data (DiaDoMes de Mes de Ano)
        DateFormat hora = DateFormat.getTimeInstance();
        System.out.println(hora.format(da));    //Somente Hora (hh:mm:ss)
        DateFormat dtHora = DateFormat.getDateTimeInstance();
        System.out.println(dtHora.format(da));  //Soma da Data com Hora

        DateFormat f = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(f.format(da)); //DiaDaSemanaPorExtenso, DiaDoMes de Mes de Ano
        f = DateFormat.getDateInstance(DateFormat.LONG); 
        System.out.println(f.format(da));   // Igual a "Soma da Data com Hora" só que o Mês é por extenso
        f = DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println(f.format(da));   // Igual a "Soma da Data com Hora"
        f = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println(f.format(da)); //BEST ONE (dd/mm/aaaa)

        Calendar ca = Calendar.getInstance(); //Mon Feb 08 12:21:16 BRT 2021
        DateFormat h = DateFormat.getTimeInstance(); //12:21:16
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        //Date d = sdf.parse("07/02/21 13:30:00");
        Date d = sdf.parse("0"+ca.get(Calendar.DAY_OF_MONTH)+"/"+ca.get(Calendar.MONTH+1)+"/"+ca.get(Calendar.YEAR)+" "+h.format(new Date()));
        System.out.println(sdf.format(d));
    }
}
