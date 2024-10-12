package s11.singleton;

public class RestaurantSingleton {

    // Atributo estático: el nombre del restaurante, común para todos
    public static String nombreRestaurante = "El Buen Sabor";

    // Atributo no estático: cada cliente tiene su número de mesa único
    public int numeroDeMesa;

    public RestaurantSingleton(int numeroDeMesa) {
        this.numeroDeMesa = numeroDeMesa;
    }

    // Menú del día: Singleton
    private static RestaurantSingleton menuDelDia;

    public static RestaurantSingleton obtenerMenuDelDia() {
        if (menuDelDia == null) {
            menuDelDia = new RestaurantSingleton(-1); // -1 porque no es una mesa real
            System.out.println("Creando el menú del día...");
        }
        return menuDelDia;
    }
}
