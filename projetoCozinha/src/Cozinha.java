import java.util.ArrayList;
import java.util.List;

public abstract class Cozinha {
  int numeroPratos;
  int numeroCozinheiros;
  int tempoPreparo;
  String tipo;
  int horarioAbertura;
  int horarioFechamento;
  String pratoPrincipal;
  List<Ingrediente> ingredientes; 

  /**
   * @return the numeroCozinheiros
   */
  public int getNumeroCozinheiros() {
    return numeroCozinheiros;
  }

  public void setNumeroCozinheiros(int numeroCozinheiros) {
    this.numeroCozinheiros = numeroCozinheiros;
  }

  public int getNumeroPratos() {
    return numeroPratos;
  }

  public void setNumeroPratos(int numeroPratos) {
    this.numeroPratos = numeroPratos;
  }

  public int getTempoPreparo() {
    return tempoPreparo;
  }

  public void setTempoPreparo(int tempoPreparo) {
    this.tempoPreparo = tempoPreparo;
  }

  public int getHorarioAbertura() {
    return horarioAbertura;
  }

  public void setHorarioAbertura(int horarioAbertura) {
    this.horarioAbertura = horarioAbertura;
  }

  public int getHorarioFechamento() {
    return horarioFechamento;
  }

  public void setHorarioFechamento(int horarioFechamento) {
    this.horarioFechamento = horarioFechamento;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public String getPratoPrincipal() {
    return pratoPrincipal;
  }

  public void setPratoPrincipal(String pratoPrincipal) {
    this.pratoPrincipal = pratoPrincipal;
  }
  public List<Ingrediente> getIngredientes() {
    return ingredientes;
  }

  public void setIngredientes(List<Ingrediente> ingredientes) {
    this.ingredientes = ingredientes;
  }

  public void addIngrediente(Ingrediente ingrediente) {
    if (ingrediente != null && this.ingredientes != null){
       this.ingredientes.add(ingrediente);

    }
   
  }

  public void PreparaPratos() {
    // o fazer p preparar pratos?
    System.out.println("Preparando Pratos");
  }

  public void LavarLouca() {
    System.out.println("Lavar louça");
  }

}