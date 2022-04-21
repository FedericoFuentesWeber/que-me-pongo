import java.util.ArrayList;
import java.util.List;


enum Categoria{
    PARTE_SUPERIOR, PARTE_INFERIOR, CALZADO, ACCESORIO
}

enum Tipo{
    CAMISA(Categoria.PARTE_SUPERIOR),
    REMERA(Categoria.PARTE_SUPERIOR),

    PANTALON(Categoria.PARTE_INFERIOR),
    VERMUDAS(Categoria.PARTE_INFERIOR),

    ZAPATOS(Categoria.CALZADO),
    ZAPATILLAS(Categoria.CALZADO),

    ANTEOJOS_DE_SOL(Categoria.ACCESORIO),
    COLLAR(Categoria.ACCESORIO);


    private Categoria categoria;
    private Tipo(Categoria categoria){
        this.categoria = categoria;
    }

    public Categoria getCategoria(){
        return categoria;
    }
}
class Prenda{
    private Categoria categoria;
    private Tipo tipo;
    private String tela;
    private String colorPrimario;
    private String colorSecundario;

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

class Atuendo{
    List<Prenda> prendas = new ArrayList<>();

    public boolean esValido(){
        return prendas.stream().allMatch(Prenda::prendaValida);
    }
}

class Cliente{
    List<Atuendo> atuendos = new ArrayList<>();

    public void nuevoAtuendo(Atuendo unAtuendo){
        if(unAtuendo.esValido()){
            atuendos.add(unAtuendo);
        }
    }
}