class Main {
  public static void main(String[] args) {

    System.out.println("Iniciando trabalhos na cozinha");
   /*
    Cozinha cozMin = new CozinhaMineira();
    cozMin.setTipo("Mineira");
    cozMin.setNumeroPratos(10);
    cozMin.setTempoPreparo(10);
    cozMin.setHorarioAbertura(14);
    cozMin.setHorarioFechamento(20);

    Cozinha cozIt = new Cozinha();
    cozIt.setTipo("Italiana");
    cozIt.setNumeroPratos(10);
    cozIt.setTempoPreparo(10);
    cozIt.setHorarioAbertura(14);
    cozIt.setHorarioFechamento(20);

    Cozinha cozChi = new Cozinha();
    cozChi.setTipo("Chinesa");
    cozChi.setNumeroPratos(10);
    cozChi.setTempoPreparo(10);
    cozChi.setHorarioAbertura(14);
    cozChi.setHorarioFechamento(20);

    Cozinha cozArabe = new Cozinha();
    cozArabe.setTipo("Árabe");
    cozArabe.setNumeroPratos(10);
    cozArabe.setTempoPreparo(10);
    cozArabe.setHorarioAbertura(14);
    cozArabe.setHorarioFechamento(20);



    System.out.println(cozMin.getTipo());
    System.out.println(cozIt.getTipo());
    System.out.println(cozChi.getTipo());
    System.out.println(cozArabe.getTipo());
  */
    Cozinha cozMineira = new CozinhaMineira();
    System.out.println(cozMineira.getTipo());
    cozMineira.PreparaPratos();
    cozMineira.LavarLouca();
   


    Cozinha cozItaliana = new CozinhaItaliana();
    System.out.println(cozItaliana.getTipo());
    cozItaliana.PreparaPratos();
    cozItaliana.LavarLouca();
  
    Cozinha cozArabe = new CozinhaArabe();
    System.out.println(cozArabe.getTipo());
    cozArabe.PreparaPratos();
    cozArabe.LavarLouca();

    Cozinha cozChinesa = new CozinhaChinesa();
    System.out.println(cozChinesa.getTipo());
    cozChinesa.PreparaPratos();
    cozChinesa.LavarLouca();
  
  
    







  }
}