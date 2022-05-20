package Prenda;

abstract class AtuendoCompleto {

  private Prenda prendaSuperior;
  private Prenda prendaInferior;
  private Prenda calzado;
  private Prenda accesorio;

  public AtuendoCompleto(Prenda prendaSuperior, Prenda prendaInferior,
                         Prenda calzado, Prenda accesorio){

    if(prendaSuperior.getCategoria()!= Categoria.PARTE_SUPERIOR)
      throw new RuntimeException("Tiene que ser parte superior");
    if(prendaInferior.getCategoria()!= Categoria.PARTE_INFERIOR)
      throw new RuntimeException("Tiene que ser parte inferior");
    if(calzado.getCategoria()!= Categoria.CALZADO)
      throw new RuntimeException("Tiene que ser un calzado");
    if(accesorio.getCategoria()!= Categoria.ACCESORIO)
      throw new RuntimeException("Tiene que ser un accesorio");

    this.prendaSuperior = prendaSuperior;
    this.prendaInferior = prendaInferior;
    this.calzado = calzado;
    this.accesorio = accesorio;
  }
}
