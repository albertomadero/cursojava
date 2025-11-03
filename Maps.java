import java.util.HashMap;
import java.util.HashSet;

public class Maps {
    public static void main(String[] args) {
        // Declaración y creación
        HashMap<String, String> names = new HashMap();
        var numbers = new HashMap<Integer, String>();

        // Tamaño
        System.out.println(names.size());

        // Añadir elementos
        names.put("Albert", "albert@gmail.com");
        names.put("Jesus", "jesus@gmail.com");
        names.put("Juan", "juan@gmail.com");
        System.out.println(names.size());
        System.out.println(names);

        // Acceder a los elementos
        System.out.println(names.get("Albert"));
        System.out.println(names.get("Al"));

        // Verificar elementos
        System.out.println(names.containsKey("Albert"));
        System.out.println(names.containsKey("Al"));

        System.out.println(names.containsValue("albert@gmail.com"));
        System.out.println(names.containsValue("Al"));

        // eliminar elementos
        System.out.println(names.remove("Albert"));
        System.out.println(names.remove("Al"));
        names.remove("A");
        System.out.println(names);

        // Limpiar
        names.clear();
        System.out.println(names);

        // Otras operaciones
        // Actualizar valores
        names.put("Jesus", "Jesus@gmai.com");
        System.out.println(names);
        names.replace("Jesus", "JesusA@gmail.com"); // Remplaza el valor si existe
        System.out.println(names);

        // Añadir valor si no existe
        names.putIfAbsent("Albert", "Alberto@gmail.com");
        System.out.println(names);

        // validar si esta vació
        System.out.println(names.isEmpty());
        // Imprimir solo valores
        var values = names.values();
        System.out.println(values);
    }
}
