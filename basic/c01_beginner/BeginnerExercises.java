package basic.c01_beginner;

/*
Clase 17 - Ejercicios: Variables y constantes
Vídeo: https://youtu.be/JOAqpdM36wI?t=6732
*/

public class BeginnerExercises {

    public static void main(String[] args) {

        // 1. Declara una variable de tipo String y asígnale tu nombre.
        String name = "Alberto";

        // 2. Crea una variable de tipo int y asígnale tu edad.
        int age = 33;

        // 3. Crea una variable double con tu altura en metros.
        double height = 1.70;

        // 4. Declara una variable de tipo boolean que indique si te gusta programar.
        boolean isTrue = true;
        // 5. Declara una constante con tu email.
        final String email = "albert@gmail.com";
        // 6. Crea una variable de tipo char y guárdale tu inicial.
        char initialName = 'A';
        // 7. Declara una variable de tipo String con tu localidad, y a continuación cambia su valor y vuelve a imprimirla.
        String city = "Guadalajara";
        System.out.println(city);
        city = "Monterrey";
        System.out.println(city);
        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.
        int a = 10;
        int b = 20;
        System.out.println(a+b);
        // 9. Imprime el tipo de dos variables creadas anteriormente.
        System.out.println(name.getClass().getSimpleName());
        System.out.println(city.getClass().getSimpleName());
        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla.
        int c;
        c = 50;
        System.out.println(c);
    }
}
