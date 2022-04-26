import java.util.ArrayList;
import java.util.List;

public class Cliente {
    List<Atuendo> atuendos = new ArrayList<>();

    public void nuevoAtuendo(Atuendo unAtuendo){
        atuendos.add(unAtuendo);
    }
}
