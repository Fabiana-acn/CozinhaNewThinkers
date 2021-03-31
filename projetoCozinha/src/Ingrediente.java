import java.time.LocalDate; // import the LocalDate class
import java.util.Calendar;


public class Ingrediente {

  String nomeIngrediente;
  LocalDate dataValidade;
  //construtor
  public Ingrediente(String nomeIngrediente,LocalDate dataValidade) {
	  this.nomeIngrediente = nomeIngrediente;
	  this.dataValidade = dataValidade;
	  
	  
  }
  public String getnomeIngrediente() {
    return nomeIngrediente;
  }
  

  //public void setnomeIngrediente(String nomeIngrediente) {
  //  this.nomeIngrediente = nomeIngrediente;
  //}

  public LocalDate getDataValidade() {
    return dataValidade;
  }

  //public void setDataValidade(LocalDate dataValidade) {
  //  this.dataValidade = dataValidade;
  //}

}


/*
import java.util.Date;
import java.util.Calendar;
//Usada no toString
import java.text.DateFormat;

public class Ingrediente {
    private String nome;
    //Documenta��o da classe Date https://docs.oracle.com/javase/8/docs/api/java/util/Date.html
    //**IMPORTANTE** o mes � de 0 a 11
    private Date data;
    //DateFormat � para formatar a data (utilizo ela no toString)
    private DateFormat formataData;
    
    public Ingrediente (String nome, int dia, int mes, int ano) {
        this.nome = nome;
        //getInstance = do mesmo jeito que esta no seu computador (calendario gregoriano).
        Calendar c = Calendar.getInstance();
        //os tres 0 no final siginifica respectivamente horas, minutos, segundos.
        //Coloquei os 0 para n�o precisar pegar a hora do computardor j� que n�o ir� precisar
        c.set(ano,mes,dia,0,0,0);
        data = c.getTime();
        formataData = DateFormat.getDateInstance();
    }


    //sobrescrevendo o metodo toString para escrever do meu jeito
    @Override
    public String toString() {
        return "Nome do Ingrediente: " + nome + "\n" + 
               "Data de Validade: " + formataData.format(data) + "\n\n";
    }

}
*/