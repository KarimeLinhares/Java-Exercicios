import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class DadosPessoais {

    public static void scanner(){
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome: ");
            String nome = scanner.next();

            System.out.println("Digite o seu sobrenome: ");
            String sobrenome = scanner.next();

            System.out.println("Digite a sua idade: ");
            int idade = scanner.nextInt();

            System.out.println("Digite a sua altura: ");
            double altura = scanner.nextDouble();

            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos");
            System.out.println("Minha altura é " + altura + "cm");
            scanner.close();
        }
        catch(InputMismatchException e){
            System.out.println("Dados escritos de forma incorreta. \nOs dados de idade e altura, precisam ser numéricos e sem . ou , \nDigite novamente.");
        }
    }
}
