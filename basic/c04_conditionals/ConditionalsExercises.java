package basic.c04_conditionals;

/*
Clase 38 - Ejercicios: Condicionales
Vídeo: https://youtu.be/JOAqpdM36wI?t=11021
*/

public class ConditionalsExercises {

    public static void main(String[] args) {

        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).
        var age = 1;
        if (age >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.
        var num1 = 101;
        var num2 = 150;
        if (num1 == num2) {
            System.out.println("Los numeros son iguales");
        } else if (num1 > num2) {
            System.out.println(num1 + " Es mayor a " + num2);
        } else {
            System.out.println(num2 + " Es mayor a " + num1);
        }
        // 3. Dado un número, verifica si es positivo, negativo o cero.
        if (num1 > 0) {
            System.out.println(num1 + " Es un número positivo");
        } else if (num1 < 0) {
            System.out.println(num1 + " Es un número negativo");
        } else {
            System.out.println(num1 + " Es cero");
        }
        // 4. Crea un programa que diga si un número es par o impar.
        if (num1 % 2 == 0) {
            System.out.println(num1 + " Es par");
        } else {
            System.out.println(num1 + " Es impar");
        }
        // 5. Verifica si un número está en el rango de 1 a 100.
        if (num1 <= 100) {
            System.out.println(num1 + " Esta entre 1 a 100");
        } else {
            System.out.println(num1 + " Esta arriba de 100");
        }
        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.
        var day = 5;
        switch (day) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
        }
        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-100).
        var nota = 69;
        if (nota <= 100 && nota >= 90) {
            System.out.println("Nota: Sobresaliente");
        } else if (nota <= 89 && nota >= 70) {
            System.out.println("Nota: Aprobado");
        } else {
            System.out.println("Nota: Suspenso");
        }
        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.
        var edad = 150;
        var isAcompanado = false;
        if (edad >= 15) {
            System.out.println("Tienes " + edad + " Puedes ingresar al cine");
        } else if (edad < 15 && isAcompanado) {
            System.out.println("Tienes " + edad + " y vienes acompañado, puedes ingresar al cine");
        } else {
            System.out.println("Tienes " + edad + " y no vienes acompañado, no puedes ingresar al cine");
        }
        // 9. Crea un programa que diga si una letra es vocal o consonante.
        // Con if
        var letra = 'e';
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
            System.out.println("La letra " + letra + " Es una vocal");
        } else {
            System.out.println("La letra " + letra + " Es una consonante");
        }
        // Con switch
        switch (letra) {
            case 'a':
                System.out.println("La letra " + letra + " Es una vocal");
                break;
            case 'e':
                System.out.println("La letra " + letra + " Es una vocal");
                break;
            case 'i':
                System.out.println("La letra " + letra + " Es una vocal");
                break;
            case 'o':
                System.out.println("La letra " + letra + " Es una vocal");
                break;
            case 'u':
                System.out.println("La letra " + letra + " Es una vocal");
                break;
            default:
                System.out.println("La letra " + letra + " Es una consonante");
        }
        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.
        var a = 15;
        var b = 16;
        var c = 12;
        var mayor = 0;

        if (a >= b && a >= c) {
            mayor = a;
        } else if (b >= a && b >= c) {
            mayor = b;
        } else {
            mayor = c;
        }

        System.out.println("El número: " + mayor + " es el mayor");
    }
}
