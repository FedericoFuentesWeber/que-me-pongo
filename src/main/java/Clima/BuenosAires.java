package Clima;

public class BuenosAires {
  private String nombreCiudad = "Buenos Aires";
  private Clima clima;

  public BuenosAires(){
    this.clima = new Clima(nombreCiudad);
  }

  public Clima getClima(){
    return clima;
  }
}
