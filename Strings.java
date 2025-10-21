public class Strings {
    public static void main(String[] args) {
        // Cadenas de texto

        // Declaración
        String name = "Alberto";
        var apellido = "Madero";

        // Operaciones basicas
        // Concatenación
        System.out.println(name + " " + apellido);

        // length (Longitud)
        System.out.println(name.length());

        // Obtener caracter de la posición en especifico
        System.out.println(name.charAt(1));

        // Obtener ultimo caracter
        System.out.println(name.charAt(name.length() - 1));

        // Subcadena desde un indice en especifico
        System.out.println(name.substring(2));
        // Subcadena de un rango (Se excluye la ultima posición)
        System.out.println(name.substring(1, 4));

        // Mayúsculas y minúsculas
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        // Comprobar si contiene algo
        System.out.println("Hola, java".toUpperCase().contains("AVA"));

        //Comparación
        System.out.println(name.equalsIgnoreCase("alberto"));
        System.out.println(name.equals("alberto"));
        System.out.println(name.equals("Alberto"));

        // Trim (Eliminar espacios del inicio y final)
        System.out.println(" Hola, mi nombre es alberto   ".trim());

        // Replace
        System.out.println(" Hola mi nombre es alberto   ".replace("alberto", "Jesus"));

        // Format
        var age = 33;
        System.out.println(String.format("Hola, mi nombre es %s. Tengo %d años.", name, age));
    }
}
