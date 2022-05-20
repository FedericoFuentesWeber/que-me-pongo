package Prenda;

public class Prenda {
    private Categoria categoria;
    private TipoPrenda tipoPrenda;
    private Trama trama;
    private String material;
    private String colorPrimario;
    private String colorSecundario;

    Prenda(Categoria categoria, TipoPrenda tipoPrenda, Trama trama, String material, String colorPrimario, String colorSecundario){
        this.categoria = categoria;
        this.tipoPrenda = tipoPrenda;
        this.trama = trama;
        this.material = material;
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
    }

}
