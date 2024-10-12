package s11.factory.coninterfaz;

public class PizzaPepperoni implements Pizza{
    @Override
    public void preparar() {
        System.out.println("Preparando la pizza de pepperoni");
    }
}
