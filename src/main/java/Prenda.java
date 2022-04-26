public class Prenda {
    private Categoria categoria;
    private Tipo tipo;
    private Tela tela;
    private String colorPrimario;
    private String colorSecundario;

    public Prenda(Tipo tipo, Tela tela){
        this.tipo = tipo;
        this.tela = tela;
    }

    public void setCategoria(Categoria categoria){
        this.categoria = categoria;
    }

    public void setColorPrimario(String colorPrimario){
        this.colorPrimario = colorPrimario;
    }

    public void setColorSecundario(String colorSecundario){
        this.colorSecundario = colorSecundario;
    }

    public boolean prendaCompleta(){
        return tela != null && !colorPrimario.isEmpty() && tipo != null && categoria != null;
    }

    public boolean categoriaCorrecta(){
        return categoria == tipo.getCategoria();
    }

    public boolean prendaValida(){
        return this.prendaCompleta() && this.categoriaCorrecta();
    }
}
