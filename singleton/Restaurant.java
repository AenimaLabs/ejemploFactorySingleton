package s11.singleton;

public class Restaurant {

    // Menú del día: Singleton
    private static Restaurant menuDelDia;

    //Constructor privado para evitar la creación de instancias desde fuera de la clase
    private Restaurant() {
    }

    // Método estático que devuelve la única instancia de la clase
    public static Restaurant obtenerMenuDelDia() {
        if (menuDelDia == null) {
            menuDelDia = new Restaurant();
        }
        return menuDelDia;
    }

}
