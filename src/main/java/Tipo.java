public enum Tipo {
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
