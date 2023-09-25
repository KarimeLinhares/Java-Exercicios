public class CaixaEletronico {
    public static double operacao(double saldo, double valorSolicitado) {
        if(valorSolicitado < saldo)
            saldo = saldo - valorSolicitado;
        return saldo;
    }
}
