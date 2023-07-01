public class CarroEsportivoImpl implements CarroEsportivo {
    @Override
    public void dirigir() {
        System.out.println("Dirigindo um carro esportivo.");
    }

    @Override
    public void exibirInfoEsportivo() {
        System.out.println("Modelo: Carro Esportivo");
    }
}