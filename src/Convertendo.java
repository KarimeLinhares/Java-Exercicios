import java.text.NumberFormat;
import java.text.ParseException;

public class Convertendo {
    public static void valor(){
        Number valor;
        try{
            valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor);
        } catch (ParseException e) {
            System.out.println("Dados não podem ser convertidos.");
        }
    }
}
