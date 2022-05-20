package Clima;

public class Ciudad {
  private String nombreCiudad;
  private Clima clima;

  public Ciudad(String nombreCiudad){
    this.nombreCiudad = nombreCiudad;
    this.clima = new Clima(nombreCiudad);
  }

  public Clima getClima(){
    return clima;
  }
}
