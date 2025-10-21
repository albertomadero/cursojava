package basic.c03_strings;

/*
Clase 34 - Ejercicios: Strings
Vídeo: https://youtu.be/JOAqpdM36wI?t=9838
*/

public class StringsExercises {

    public static void main(String[] args) {

        // 1. Concatena dos cadenas de texto.
        var cadena1 = "Hello, my name is";
        var cadena2 = "Alberto";
        System.out.println(cadena1 + " " + cadena2);
        // 2. Muestra la longitud de una cadena de texto.
        var cadena3 = cadena1 + " " + cadena2;
        System.out.println("Tamaño de la cadena: " + cadena3.length());
        // 3. Muestra el primer y último carácter de un string.
        var name = "Alberto";
        System.out.println("String completo: " + name + "\n" + "Primer caracter: " + name.charAt(0)
        + "\n" + "Último caracter: " + name.charAt(name.length() - 1));
        // 4. Convierte a mayúsculas y minúsculas un string.
        var frase = "HoLa EstO eS un EjempLo";
        System.out.println("Frase original: " + frase);
        System.out.println("Frase en mayúsculas: " + frase.toUpperCase());
        System.out.println("Frase en minúsculas: " + frase.toLowerCase());
        // 5. Comprueba si una cadena de texto contiene una palabra concreta.
        System.out.println("\nFrase original: " + frase);
        System.out.println("Contiene la palabra 'ejemplo': " + frase.toLowerCase().contains("ejemplo"));
        // 6. Formatea un string con un entero.
        var age = 33;
        System.out.println(String.format("Hello, my name is %s, i'm %d years old", name, age));
        // 7. Elimina los espacios en blanco al principio y final de un string.
        var fraseEspacios = " Esta es una frase con espacios   ";
        System.out.println(String.format("Frase original:%s\nFrase sin espacios:%s", fraseEspacios, fraseEspacios.trim()));
        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).
        System.out.println("\n" + fraseEspacios.replace(" ", "-"));
        // 9. Comprueba si dos strings son iguales.
        System.out.println("El string: " + name + "Es igual al string: " + frase + "\nVerificando: "
        + name.equals(frase));
        // 10. Comprueba si dos strings tienen la misma longitud.
        var str1 = "HoLa ComO EstaS";
        var str2 = "Hola como cacas";
        System.out.println("El string: " + str1 + ", contiene la misma longitud que el string: " + str2 + "\nVerificando...: "
                + (str1.length() == str2.length()));
        // Otra forma es guardar la comparación en una variable booleana
        var validarString = str1.length() == str2.length();
        System.out.println("Es igual: " + validarString);
    }
}
