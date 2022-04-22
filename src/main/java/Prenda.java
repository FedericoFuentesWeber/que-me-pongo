public class Prenda {
    private Categoria categoria;
    private Tipo tipo;
    private String tela;
    private String colorPrimario;
    private String colorSecundario;

    public Prenda (Categoria categoria, Tipo tipo, String tela, String colorPrimario, String colorSecundario){
        this.categoria = categoria;
        this.tipo = tipo;
        this.tela = tela;
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
    }
    public boolean prendaCompleta(){
        return !tela.isEmpty() && !colorPrimario.isEmpty() && tipo != null && categoria != null;
    }

    public boolean categoriaCorrecta(){
        return categoria == tipo.getCategoria();
    }

    public boolean prendaValida(){
        return this.prendaCompleta() && this.categoriaCorrecta();
    }
}
