package s11.factory.coninterfaz;

public class PizzaFactory {

    public static Pizza crearPizza(String tipo) {
        switch (tipo.toLowerCase()) {
            case "margarita":
                return new PizzaMargarita();
            case "pepperoni":
                return new PizzaPepperoni();
            case "napolitana":
                return new PizzaNapolitana();
            default:
                throw new IllegalArgumentException("La pizza no existe");
        }
    }
}
