package basic.c02_operators;

/*
Clase 23 - Ejercicios: Operadores
Vídeo: https://youtu.be/JOAqpdM36wI?t=8085
*/

public class OperatorsExercises {

    public static void main(String[] args) {

        // 1. Crea una variable con el resultado de cada operación aritmética.
        var sumaInt = 10 + 9;
        var sumaDouble = 5.8 + 9.3;
        var multiplicacion = 4 * 8;
        var division = 400 / 45;
        var resto = 300 % 40;
        // 2. Crea una variable para cada tipo de operación de asignación.
        var name = "Alberto";
        var nombre = name;
        var a = 5;
        var b = a + 4;
        var asocDir = 0;
        asocDir += a;
        asocDir -= 5;
        asocDir *= 7;
        asocDir %= 10;
        asocDir /= 6;
        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.
        System.out.println(a == b);
        System.out.println(b > a);
        System.out.println(a != b);
        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.
        var x = 10;
        var y = 20;
        System.out.println(x > y);
        System.out.println(y < x);
        System.out.println(x >= y);
        // 5. Utiliza el operador lógico and.
        System.out.println(x == x && y == y);
        System.out.println(x > y && y < x);
        // 6. Utiliza el operador lógico or.
        System.out.println(x < y || y < x);
        System.out.println(x > y && y < x);
        // 7. Combina ambos operadores lógicos.
        System.out.println(x > y || y > x && x > x);
        // 8. Añade alguna negación.
        System.out.println(x < y && !(y < x));
        System.out.println(x > y || !(y < x));
        // 9. Imprime 3 ejemplos de uso de operadores unarios.
        var num1 = 10;
        num1 ++;
        System.out.println(num1);
        num1 --;
        System.out.println(num1--);
        System.out.println(num1);
        // 10. Combina operadores aritméticos, de comparación y lógicos.
        var numero1 = 10;
        var numero2 = 15;
        var resul = numero1 + numero2;
        System.out.println(resul); // 25
        resul += numero1; // 35
        System.out.println(resul); // 35
        resul ++;
        System.out.println(resul); // 36
        System.out.println(resul == numero1 || numero2 == resul); // false
        System.out.println(resul == numero1 && numero2 == resul); // false
        System.out.println(resul > numero1 || numero2 == resul); // true
        System.out.println(resul > numero1 && numero2 < resul); // true
    }
}
