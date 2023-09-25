public class SistemaMedidas {
    public static void medida(String sigla){
        switch (sigla){
            case "P":
            case "p":
                System.out.println("Tamanho Pequeno");
                break;
            case "M":
            case "m":
                System.out.println("Tamanho Médio");
                break;
            case "G":
            case "g":
                System.out.println("Tamanho Grande");
                break;
            case "XG":
            case "xg":
                System.out.println("Tamanho Extra Grande");
                break;
            default:
                System.out.println("Tamanho incorreto");
                break;
        }
    }
}
