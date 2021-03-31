import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate; // import the LocalDate class


public class CozinhaMineira extends Cozinha {

  public CozinhaMineira() {
    this.setTipo("Cozinha Mineira3");
    this.setNumeroPratos(10);
    this.setTempoPreparo(10);
    this.setHorarioAbertura(14);
    this.setHorarioFechamento(20);
    this.setPratoPrincipal("Feijoada");
    this.setIngredientes(new ArrayList<Ingrediente>());
        
     
       
        
    

  }
// herança 
  @Override
  public void PreparaPratos() {

    // o fazer p preparar pratos?
    System.out.println("Preparando Pratos Mineira!");
    System.out.println("Prato Principal: Feijoada!");
    this.addIngrediente(new Ingrediente("Feijao",LocalDate.now().plusMonths(1)));
    
  
  }
  
 
  
  

  
  
  
  
  
}
