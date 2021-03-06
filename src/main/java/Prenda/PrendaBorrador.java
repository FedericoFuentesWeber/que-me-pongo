package Prenda;

import java.util.Objects;

public class PrendaBorrador {
    private Categoria categoria;
    private TipoPrenda tipoPrenda;
    private Trama trama = Trama.LISA;
    private String material;
    private String colorPrimario;
    private String colorSecundario;

    PrendaBorrador(TipoPrenda tipoPrenda){
        this.tipoPrenda = Objects.requireNonNull(tipoPrenda);
    }

    public boolean categoriaCorrecta(){
        return categoria == tipoPrenda.getCategoria();
    }

    public void elegirCategoria(Categoria categoria){
        if(this.categoriaCorrecta()){
            this.categoria = Objects.requireNonNull(categoria);
        }
    }
    
    public void elegirTrama(Trama trama){
        if(trama != null){
            this.trama = trama;
        }
    }
    public void elegirMaterial(String material){
        this.material = Objects.requireNonNull(material);
    }
    
    public void elegirColorPrimario(String colorPrimario){
        this.colorPrimario = Objects.requireNonNull(colorPrimario);
    }
    
    public void elegirColorSecundario(String colorSecundario){
        this.colorSecundario = Objects.requireNonNull(colorSecundario);
    }
    
    public Prenda crearPrenda(){
        return new Prenda(categoria, tipoPrenda, trama, material, colorPrimario, colorSecundario);
    }
}
