package s11.factory.coninterfaz;

public class Main {
    public static void main(String[] args) {

        Pizza pizza1 = PizzaFactory.crearPizza("margarita");
        pizza1.preparar();

        Pizza pizza2 = PizzaFactory.crearPizza("pepperoni");
        pizza2.preparar();

        Pizza pizza3 = PizzaFactory.crearPizza("napolitana");
        pizza3.preparar();
    }
}
