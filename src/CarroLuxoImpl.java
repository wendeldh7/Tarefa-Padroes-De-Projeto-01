public class CarroLuxoImpl implements CarroLuxo {
    @Override
    public void dirigir() {
        System.out.println("Dirigindo um carro de luxo.");
    }

    @Override
    public void exibirInfoLuxo() {
        System.out.println("Modelo: Carro de Luxo");
    }
}