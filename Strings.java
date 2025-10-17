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
    }
}
