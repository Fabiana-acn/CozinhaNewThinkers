class Main {
  public static void main(String[] args) {
	  

    System.out.println("Iniciando trabalhos na cozinha");
  
    Cozinha cozMineira = new CozinhaMineira();
    System.out.println(cozMineira.getTipo());
    
    cozMineira.addFuncionario(new Funcionario("Maria","Chefe"));
    cozMineira.addFuncionario(new Funcionario("Joana","Sub-Chefe"));
    cozMineira.addFuncionario(new Funcionario("Ana","Ajudante"));
    cozMineira.addFuncionario(new Funcionario("Marisa","Ajudante"));
    
    cozMineira.PreparaPratos();
    cozMineira.MostrarIngredientesPrato();
    cozMineira.LavarLouca();   

    
    System.out.println("");
    
    Cozinha cozItaliana = new CozinhaItaliana();
    System.out.println(cozItaliana.getTipo());
    
    cozItaliana.addFuncionario(new Funcionario("Joana","Sub-Chefe"));
    cozItaliana.addFuncionario(new Funcionario("Ana","Ajudante"));
    
    
    cozItaliana.PreparaPratos();
    cozItaliana.MostrarIngredientesPrato();
    cozItaliana.LavarLouca();
    
    System.out.println("");
  
    Cozinha cozArabe = new CozinhaArabe();
    cozArabe.addFuncionario(new Funcionario("Joana","Sub-Chefe"));
    cozArabe.addFuncionario(new Funcionario("Ana","Ajudante"));
    cozArabe.addFuncionario(new Funcionario("Marisa","Ajudante"));
    System.out.println(cozArabe.getTipo());
    cozArabe.PreparaPratos();
    cozItaliana.MostrarIngredientesPrato();
    cozArabe.LavarLouca();
    
    System.out.println("");

    Cozinha cozChinesa = new CozinhaChinesa();
    cozChinesa.addFuncionario(new Funcionario("Joana","Sub-Chefe"));
    cozChinesa.addFuncionario(new Funcionario("Ana","Ajudante"));
    cozChinesa.addFuncionario(new Funcionario("Marisa","Ajudante"));
    System.out.println(cozChinesa.getTipo());
    cozChinesa.PreparaPratos();
    cozItaliana.MostrarIngredientesPrato();
    cozChinesa.LavarLouca();
  
  
    







  }
}