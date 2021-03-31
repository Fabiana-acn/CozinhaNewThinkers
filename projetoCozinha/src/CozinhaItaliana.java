public class CozinhaItaliana extends Cozinha {

  public CozinhaItaliana() {
    this.setTipo("Cozinha Italiana!");
    this.setNumeroPratos(10);
    this.setTempoPreparo(10);
    this.setHorarioAbertura(14);
    this.setHorarioFechamento(20);
  }

  @Override
  public void PreparaPratos() {
    // o fazer p preparar pratos?
    System.out.println("Preparando Pratos Italiana!");
  }
}
