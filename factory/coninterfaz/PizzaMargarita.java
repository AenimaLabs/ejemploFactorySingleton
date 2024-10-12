package s11.factory.coninterfaz;

public class PizzaMargarita implements Pizza {
    @Override
    public void preparar() {
        System.out.println("Preparando la pizza de margarita");
    }
}
