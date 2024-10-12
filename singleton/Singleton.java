package s11.singleton;

public class Singleton {

    // Variable estática que contiene la única instancia del Singleton
    private static Singleton instance;

    // Constructor privado para evitar la creación de instancias desde fuera de la clase
    private Singleton() {
        System.out.println("Singleton creado");
    }

    // Método estático que devuelve la única instancia de la clase
    public static Singleton getInstance() {
        if (instance == null) {
            System.out.println("Creando nueva instancia de Singleton");
            return instance = new Singleton();

        }
        System.out.println("devuelve la instancia de Singleton");
        return instance;
    }
}
