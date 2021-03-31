import java.time.LocalDate;
import java.util.ArrayList;

public class CozinhaArabe extends Cozinha {

  public CozinhaArabe() {
    this.tipo = "Cozinha Arabe";
    this.numeroPratos = 10;
    this.tempoPreparo = 10;
    this.horarioAbertura = 14;
    this.horarioFechamento = 22;
    this.pratoPrincipal = "Esfirra de Carne";
    this.ingredientes = new ArrayList<Ingrediente>();
    this.funcionarios =new ArrayList<Funcionario>();
  }

  @Override
  public void PreparaPratos() {
    // o fazer p preparar pratos?
    System.out.println("Preparando Pratos Arabe");
    System.out.println("Prato Principal: "+ this.pratoPrincipal);
    this.addIngrediente(new Ingrediente("Farinha",LocalDate.now().plusMonths(1)));
    this.addIngrediente(new Ingrediente("Molho de Tomate",LocalDate.now().plusMonths(1)));
    this.addIngrediente(new Ingrediente("Carne",LocalDate.now().plusMonths(1)));
    this.addIngrediente(new Ingrediente("Pimenta",LocalDate.now().plusMonths(1)));
  }
}