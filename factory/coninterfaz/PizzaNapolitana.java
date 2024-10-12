package s11.factory.coninterfaz;

public class PizzaNapolitana implements Pizza {
    @Override
    public void preparar() {
        System.out.println("Preparar la pizza de Napolitana");
    }
}
