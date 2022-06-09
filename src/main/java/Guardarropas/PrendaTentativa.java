package Guardarropas;

import Prenda.Prenda;

public class PrendaTentativa {
  private boolean prendaAceptada = false;
  private Prenda prenda;

  public PrendaTentativa(Prenda prenda){
    this.prenda = prenda;
  }

  public boolean condicionActual(){
    return prendaAceptada;
  }

  public Prenda getPrenda(){
    return prenda;
  }

  public void aceptarPrenda(){
    this.prendaAceptada = true;
  }

  public void rechazarPrenda(){
    this.prendaAceptada = false;
  }
}
