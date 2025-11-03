import java.util.HashSet;

public class Set {
    public static void main(String[] args) {
        // Declaración y creación
        HashSet<String> names = new HashSet<>();
        var numbers = new HashSet<Integer>();

        // Tamaño
        System.out.println(names.size());

        // Añadir elementos
        names.add("Albert");
        names.add("Madero");
        names.add("Venegas");

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // Tamaño
        System.out.println(names.size());

        // Imprimir contenido
        System.out.println(names);
        names.add("Jesus");
        System.out.println(names);

        // Validar si contiene elementos
        System.out.println(names.contains("Albert"));
        System.out.println(names.contains("No"));

        // Eliminar elementos
        names.remove("Jesus");
        System.out.println(names.size());

        // No se pueden añadir elementos repetidos
        System.out.println(names);
        names.add("Jesus");
        names.add("Jesus");
        names.add("Jesus");
        System.out.println(names);

        // Conjuntos

        // names.addAll(numbers); Error por tipo de dato diferente
        var countries = new HashSet<String>();
        countries.add("Mexico");
        countries.add("España");
        countries.add("Argentina");

        names.addAll(countries);
        System.out.println(names);

        names.removeAll(countries);
        System.out.println(names);

        // Dejar elementos comunes
        names.retainAll(countries);
        System.out.println(names);
    }
}
