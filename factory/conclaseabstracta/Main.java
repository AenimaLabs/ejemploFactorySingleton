package s11.factory.conclaseabstracta;

public class Main {
    public static void main(String[] args) {

      Pizza pizza1 = FabricaPizzas.crearPizza("margarita");
      pizza1.preparar();

      Pizza pizza2 = FabricaPizzas.crearPizza("pepperoni");
      pizza2.preparar();

      Pizza pizza3 = FabricaPizzas.crearPizza("napolitana");
      pizza3.preparar();
    }
}
