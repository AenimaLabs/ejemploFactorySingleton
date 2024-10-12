package s11.singleton;

public class Main {
    public static void main(String[] args) {

        //////////////////
        //USANDO CLASE SINGLETON
//        Singleton singleton = Singleton.getInstance();
//        Singleton singleton2 = Singleton.getInstance();
//        Singleton singleton3 = Singleton.getInstance();
//        System.out.println(singleton == singleton2);

        ///////////////////////////////////
        //USANDO CLASE RESTAURANTSINGLETON
//
        // El nombre del restaurante es el mismo para todos
        System.out.println(RestaurantSingleton.nombreRestaurante); // Imprime "El Buen Sabor"

        // Cada cliente tiene su propio número de mesa
        RestaurantSingleton cliente1 = new RestaurantSingleton(1);
        RestaurantSingleton cliente2 = new RestaurantSingleton(2);

        System.out.println("Cliente 1 está en la mesa: " + cliente1.numeroDeMesa); // Imprime 1
        System.out.println("Cliente 2 está en la mesa: " + cliente2.numeroDeMesa); // Imprime 2

        // Todos ven el mismo menú del día (Singleton)
        RestaurantSingleton menu1 = RestaurantSingleton.obtenerMenuDelDia();
        RestaurantSingleton menu2 = RestaurantSingleton.obtenerMenuDelDia();

        System.out.println(menu1 == menu2); // Imprime true, porque es el mismo menú

        //USANDO CLASE RESTAURANT
//        Restaurant menu1 = Restaurant.obtenerMenuDelDia();
//        Restaurant menu2 = Restaurant.obtenerMenuDelDia();
//        System.out.println(menu1 == menu2);
    }
}
