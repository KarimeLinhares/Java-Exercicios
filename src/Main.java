public class Main {
    public static void main(String[] args) {
        // Calculadora
        System.out.println("Exercício calculadora");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);

        // Mensagem
        System.out.println("\nExercício mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        // Empréstimo
        System.out.println("\nExercício empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

        // Quadrilátero
        System.out.println("\nExercício quadrilátero");
        Quadrilatero.area(3);
        Quadrilatero.area(5d,5d);
        Quadrilatero.area(7,8,9);
        Quadrilatero.area(5f,5f);

        //Quadrilátero2
        System.out.println("\nExercícios retorno");

        double areaQuadrado = Quadrilatero2.area(3);
        System.out.println("A área do quadrado é: " + areaQuadrado);

        double areaRetangulo = Quadrilatero2.area(5,5);
        System.out.println("A área do retângulo é: " + areaRetangulo);

        double areaTrapezio = Quadrilatero2.area(7, 8, 9);
        System.out.println("A área do trapézio é: " + areaTrapezio);
    }
}