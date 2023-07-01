public class FabricaCarroImpl implements FabricaCarro {
    @Override
    public CarroEsportivo criarCarroEsportivo() {
        return new CarroEsportivoImpl();
    }

    @Override
    public CarroLuxo criarCarroLuxo() {
        return new CarroLuxoImpl();
    }
}