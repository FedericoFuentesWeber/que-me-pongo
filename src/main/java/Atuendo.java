import java.util.ArrayList;
import java.util.List;

public class Atuendo {
    List<Prenda> prendas = new ArrayList<>();

    public void nuevaPrenda(Prenda unaPrenda){
        if(unaPrenda.prendaValida()){
            prendas.add(unaPrenda);
        }
    }
}
