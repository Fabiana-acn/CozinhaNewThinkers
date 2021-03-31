import java.time.LocalDate;
import java.util.ArrayList;

public class CozinhaChinesa extends Cozinha {

  public CozinhaChinesa() {
    this.tipo="Cozinha Chinesa";
    this.numeroPratos=10;
    this.tempoPreparo=10;
    this.horarioAbertura = 10;
    this.horarioFechamento = 21;
    this.pratoPrincipal = "Yakissoba";
    this.ingredientes = new ArrayList<Ingrediente>();
    this.funcionarios=new ArrayList<Funcionario>();
    
  }

  @Override
  public void PreparaPratos() {
    // o fazer p preparar pratos?
    System.out.println("Preparando Pratos Chinesa!");
    System.out.println("Prato Principal: !");
    this.addIngrediente(new Ingrediente("Champignon",LocalDate.now().plusMonths(1)));
    this.addIngrediente(new Ingrediente("Brócolis",LocalDate.now().plusMonths(1)));
    this.addIngrediente(new Ingrediente("Macarrão",LocalDate.now().plusMonths(1)));
    this.addIngrediente(new Ingrediente("Carne",LocalDate.now().plusMonths(1)));
  }
}
