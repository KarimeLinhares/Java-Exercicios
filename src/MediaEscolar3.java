public class MediaEscolar3 {
    public static void media(double nota){
        String resultado = nota >=7 ? "\nAluno Aprovado" : nota >=5 ? "\nAluno em Recuperação" : "\nAluno Reprovado";
        System.out.println("A nota do aluno é: "+ nota + resultado);
    }
}
