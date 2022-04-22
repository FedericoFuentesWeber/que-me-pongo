import java.util.ArrayList;
import java.util.List;

public class Atuendo {
    List<Prenda> prendas = new ArrayList<>();

    public void nuevaPrenda(Prenda unaPrenda){
        prendas.add(unaPrenda);
    }
    public boolean esValido(){
        return prendas.stream().allMatch(Prenda::prendaValida);
    }
}