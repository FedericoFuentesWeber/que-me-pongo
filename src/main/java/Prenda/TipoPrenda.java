package Prenda;

public enum TipoPrenda {
    CAMISA(Categoria.PARTE_SUPERIOR, 18, 30),
    REMERA(Categoria.PARTE_SUPERIOR, 16, 35),

    PANTALON(Categoria.PARTE_INFERIOR, 10, 25),
    VERMUDAS(Categoria.PARTE_INFERIOR, 20, 35),

    ZAPATOS(Categoria.CALZADO, 15, 25),
    ZAPATILLAS(Categoria.CALZADO, 15, 30),

    ANTEOJOS_DE_SOL(Categoria.ACCESORIO, 10, 40),
    COLLAR(Categoria.ACCESORIO, 20, 25);


    private Categoria categoria;
    private int temperaturaMinima;
    private int temperaturaMaxima;
    TipoPrenda(Categoria categoria, int temperaturaMinima, int temperaturaMaxima){
        this.categoria = categoria;
        this.temperaturaMinima = temperaturaMinima;
        this.temperaturaMaxima = temperaturaMaxima;
    }

    public Categoria getCategoria(){
        return categoria;
    }
    public int getTemperaturaMinima(){
        return temperaturaMinima;
    }
    public int getTemperaturaMaxima(){
        return temperaturaMaxima;
    }
}
