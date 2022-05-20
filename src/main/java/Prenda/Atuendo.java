package Prenda;

import Clima.Clima;
import java.util.ArrayList;
import java.util.List;

public class Atuendo extends AtuendoCompleto{
    List<Prenda> prendas;

    public Atuendo(Prenda prendaSuperior, Prenda prendaInferior,
                   Prenda calzado, Prenda accesorio){

        super(prendaSuperior, prendaInferior, calzado, accesorio);
        this.prendas = new ArrayList<>();
    }
    public void nuevaPrenda(Prenda unaPrenda){
        prendas.add(unaPrenda);
    }
    public boolean acordeAlClima(Clima clima){
        return prendas.stream().allMatch(prenda -> prenda.acordeATemperatura(clima));
    }
}
