public class NaveEspacialDecorator extends NaveEspacial{
    private NaveEspacial naveDecorada;

    public NaveEspacialDecorator(NaveEspacial naveDecorada) {
        super(naveDecorada.getSaude(), naveDecorada.getAtaque());
        this.naveDecorada = naveDecorada;
    }

    @Override
    public int getSaude() {
        return naveDecorada.getSaude();
    }

    @Override
    public int getAtaque() {
        return naveDecorada.getAtaque();
    }
}