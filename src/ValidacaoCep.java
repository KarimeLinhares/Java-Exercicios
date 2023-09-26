public class ValidacaoCep {
    public static void formatar(){
       try{
           String cepFormatado = formatarCep("23765064");
           System.out.println(cepFormatado);
       } catch (CepInvalidoException e){
           System.out.println("não foi possível formatar!");
       }
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() !=8)
            throw new CepInvalidoException();
        return "23.765-064";
    }
}
