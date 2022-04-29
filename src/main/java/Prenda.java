public class Prenda {
    private Categoria categoria;
    private Tipo tipo;
    private Trama trama;
    private String material;
    private String colorPrimario;
    private String colorSecundario;

    Prenda(Categoria categoria, Tipo tipo, Trama trama, String material, String colorPrimario, String colorSecundario){
        this.categoria = categoria;
        this.tipo = tipo;
        this.trama = trama;
        this.material = material;
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
    }

}
