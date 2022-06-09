package Guardarropas;

import Prenda.Prenda;

public class RechazarCommand implements Command {
  private PrendaTentativa prendaTentativa;

  public RechazarCommand(Prenda prenda) {
    prendaTentativa = new PrendaTentativa(prenda);
  }

  @Override
  public PrendaTentativa getPrendaTentativa() {
    return prendaTentativa;
  }

  @Override
  public void execute() {
    prendaTentativa.rechazarPrenda();
  }
}
