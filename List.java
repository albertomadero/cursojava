import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        // Declaración y creación
        ArrayList<String> names = new ArrayList<>();
        var numbers = new ArrayList<Integer>();

        // Tamaño
        System.out.println(names.size());

        // Añadir elementos
        names.add("Albert");
        names.add("Madero");
        names.add("Venegas");
        names.add(0,"Jesus");

        // Tamaño
        System.out.println(names.size());

        // Acceder a los elementos
        System.out.println(names.getFirst());
        System.out.println(names.get(1));
        System.out.println(names.getLast());

        // Modificar los elementos
        names.set(2, "venegasm.alberto@gmail.com");
        System.out.println(names.get(2));

        // Eliminar elementos
        System.out.println("Tamaño arraylist: " + names.size());
        names.remove(3);
        System.out.println("Tamaño arraylist: " + names.size());
        // no se puede acceder a un elemento que ya se elimino
        //System.out.println(names.get(3)); Error

        // Buscar elementos

        System.out.println(names.contains("Albert"));
        System.out.println(names.contains("Venegas"));
        // Imprimir todos los elementos
        System.out.println(names);
        // Limpiar array list
        names.clear();
        System.out.println("Tamaño arraylist: " + names.size());

    }
}
