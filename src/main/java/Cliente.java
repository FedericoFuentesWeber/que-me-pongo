import Clima.Ciudad;
import Prenda.Atuendo;
import Prenda.PrendaBorrador;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private Ciudad ciudad;
    List<Atuendo> atuendos;
    List<Atuendo> atuendosSugeridos;

    public Cliente(){
        this.ciudad = new Ciudad("Buenos Aires");
        this.atuendos = new ArrayList<>();
        this.atuendosSugeridos = new ArrayList<>();
    }
    public void nuevoAtuendo(Atuendo unAtuendo){
        atuendos.add(unAtuendo);
    }

    public void sugerenciaDeAtuendoCompleto(Atuendo atuendoSugerido){
        if(atuendoSugerido.acordeAlClima(ciudad.getClima())){
            atuendosSugeridos.add(atuendoSugerido);
        }
        throw new RuntimeException("El atuendo no es acorde al clima actual.");
    }
}
