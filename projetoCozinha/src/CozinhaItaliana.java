import java.time.LocalDate;
import java.util.ArrayList;

public class CozinhaItaliana extends Cozinha {

  public CozinhaItaliana() {
    this.tipo = "Cozinha Italiana!";
    this.numeroPratos = 10;
    this.tempoPreparo = 10;
    this.horarioAbertura = 13;
    this.horarioFechamento = 22;
    this.pratoPrincipal="Espaguete";
    this.ingredientes = new ArrayList<Ingrediente>();
    this.funcionarios = new ArrayList<Funcionario>();
  }

  @Override
  public void PreparaPratos() {
    // o fazer p preparar pratos?
    System.out.println("Preparando Pratos Italiana!");
    System.out.println("Prato Principal: !");
    this.addIngrediente(new Ingrediente("Molho",LocalDate.now().plusMonths(1)));
    this.addIngrediente(new Ingrediente("Macarrão",LocalDate.now().plusMonths(1)));
    this.addIngrediente(new Ingrediente("Carne",LocalDate.now().plusMonths(1)));
  }
}

