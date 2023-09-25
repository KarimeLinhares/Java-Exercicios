public class MediaEscolar2 {
    public static void media(double nota){
        if (nota >= 7)
            System.out.println("A nota do aluno é: "+ nota + "\nAprovado!");
        else if (nota >= 5)
            System.out.println("A nota do aluno é: "+ nota + "\nEm Recuperação!");
        else
            System.out.println("A nota do aluno é: "+ nota + "\nReprovado!");
    }
}
