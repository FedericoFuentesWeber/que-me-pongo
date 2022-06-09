package Guardarropas;

import Prenda.Prenda;

public class AceptarCommand implements Command {
  private PrendaTentativa prendaTentativa;

  public AceptarCommand(Prenda prenda) {
    prendaTentativa = new PrendaTentativa(prenda);
  }

  @Override
  public PrendaTentativa getPrendaTentativa() {
    return prendaTentativa;
  }

  @Override
  public void execute() {
    prendaTentativa.aceptarPrenda();
  }
}
