import java.util.ArrayList;
import java.util.List;

public class Ejercicio8 {
    public static void main(String[] args) {
        // Usando List en lugar de un array fijo
        List<String> tareas = new ArrayList<>();

        tareas.add("Aprender Git");
        tareas.add("Subir a GitHub");
        tareas.add("Completar Ejercicio 8");

        System.out.println("Lista de tareas: " + tareas);
    }
}