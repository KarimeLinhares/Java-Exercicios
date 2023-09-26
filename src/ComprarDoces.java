import java.text.DecimalFormat;
import java.util.concurrent.ThreadLocalRandom;

public class ComprarDoces {

    public static void mesada(){
        double mesada = 50.0;
        while(mesada>0){
            double valorDoce = valorAleatorio();
            if(valorDoce > mesada)
                valorDoce = mesada;
            System.out.println("O Preço do doce é de: R$" + new DecimalFormat("#,##0.00").format(valorDoce) + " Foi adicionado ao carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Valor da Mesada: R$ " + new DecimalFormat("#,##0.00").format(mesada));
        System.out.println("Joãozinho gastou toda a sua mesada em doces");
    }
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
}
