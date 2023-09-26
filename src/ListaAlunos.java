public class ListaAlunos {
    public static void alunos() {
        String[] alunos = {"Felipe", "Jonas", "Julia", "Marcos"};
        for (int x=0; x<alunos.length; x++) {
            System.out.println("O aluno no indice x = " + x + " é " + alunos[x]);
        }
    }
}
