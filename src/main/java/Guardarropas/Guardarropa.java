package Guardarropas;

import Cliente.Cliente;
import Prenda.Prenda;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Guardarropa {

  List<Prenda> prendasEnElGuardarropa;
  List<Prenda> versionAnteriorDelGuardarropas;
  List<Prenda> prendasTentativasParaAgregar;
  List<Prenda> prendasTentativasParaQuitar;
  List<Command> listaDeCommands;

  public Guardarropa() {
    prendasEnElGuardarropa = new ArrayList<>();
    versionAnteriorDelGuardarropas = new ArrayList<>();
    prendasTentativasParaAgregar = new ArrayList<>();
    prendasTentativasParaQuitar = new ArrayList<>();
    listaDeCommands = new ArrayList<>();
  }

  public void agregarCommand(Command nuevoCommand) {
    nuevoCommand.execute();
    listaDeCommands.add(nuevoCommand);
  }

  public void actualizarListasDePrendasTentativas(){
    listaDeCommands.stream()
        .filter(Command -> Command.getPrendaTentativa().condicionActual())
        .forEach(Command -> prendasTentativasParaAgregar.add(Command.getPrendaTentativa().getPrenda()));

    listaDeCommands.stream()
        .filter(Command -> !Command.getPrendaTentativa().condicionActual())
        .forEach(Command -> prendasTentativasParaQuitar.add(Command.getPrendaTentativa().getPrenda()));
  }

  public void aceptarPropuestas(){
    versionAnteriorDelGuardarropas.addAll(prendasEnElGuardarropa);
    prendasEnElGuardarropa.addAll(prendasTentativasParaAgregar);
    prendasEnElGuardarropa.removeAll(prendasTentativasParaQuitar);
  }

  public void rechazarPropuestas(){
    prendasTentativasParaAgregar.clear();
    prendasTentativasParaQuitar.clear();
  }

  public void deshacerPropuestasAceptadas(){
    prendasEnElGuardarropa = versionAnteriorDelGuardarropas;
  }
}
