package s11.factory.conclaseabstracta;

public class FabricaPizzas {

    public static Pizza crearPizza(String tipo) {
     switch (tipo.toLowerCase()) {
         case "margarita":
             return new PizzaMargarita();
         case "napolitana":
             return new PizzaNapolitana();
         case "pepperoni":
             return new PizzaPepperoni();
         default:
             return null;
     }
    }
}
