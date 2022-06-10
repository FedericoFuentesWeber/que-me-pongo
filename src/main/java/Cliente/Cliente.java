package Cliente;

import Clima.Ciudad;
import Guardarropas.Command;
import Guardarropas.Guardarropa;
import Prenda.Atuendo;
import Prenda.Prenda;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
  private Ciudad ciudad;
  List<Atuendo> atuendos;
  List<Atuendo> atuendosSugeridos;
  List<Guardarropa> guardarropas;

  public Cliente() {
    this.ciudad = new Ciudad("Buenos Aires");
    this.atuendos = new ArrayList<>();
    this.atuendosSugeridos = new ArrayList<>();
    this.guardarropas = new ArrayList<>();
  }

  public void nuevoAtuendo(Atuendo unAtuendo) {
    atuendos.add(unAtuendo);
  }

  public void nuevoGuardarropa(Guardarropa unGuardarropa) {
    guardarropas.add(unGuardarropa);
  }

  public void compartirGuardarropa(Cliente otraPersona, Guardarropa guardarropaCompartido) {
    otraPersona.nuevoGuardarropa(guardarropaCompartido);
  }

  public void proposicionSobreRopa(Guardarropa guardarropa, Command nuevoCommand) {
    guardarropa.agregarCommand(nuevoCommand);
  }

  public void sugerenciaDeAtuendoCompleto(Atuendo atuendoSugerido) {
    if (atuendoSugerido.acordeAlClima(ciudad.getClima())) {
      atuendosSugeridos.add(atuendoSugerido);
    }
    throw new RuntimeException("El atuendo no es acorde al clima actual.");
  }
}
