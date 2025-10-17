public class Operators {
    public static void main(String[] args) {
        // Operadores
        //Aritmeticos
        var a = 5;
        var b = 3;

        // Suma
        System.out.println(a+b);
        // Resta
        System.out.println(a-b);
        // Multiplicación
        System.out.println(a*b);
        // División
        System.out.println(a/b);
        // Resto
        System.out.println(a%b);

        // Operadores de asignación
        // Asignar como valor otra variable
        a = b;
        // Asignar como valor la operación de una varibale
        a = b * 2;
        // Asignación directa
        a += 1; // a = a + 1
        System.out.println(a);
        a -= 1;
        a *= 2;
        a /= 2;
        a %= 1;

        // Operadores de comparación (Relacionales)
        // Comparar si son iguales
        System.out.println(a == b);
        // Comparar si son diferentes
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a < b);
        System.out.println(a >= b);

        // Operadores logicos

        // Y (AND)
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println(3 > 2 && 5 == 2);

        // O (OR)
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println(3 > 2 || 5 == 2);

        // NO (NOT)
        System.out.println(!true);
        System.out.println(!false);

        System.out.println(!(3 > 2) || 5 == 2);

        // Unarios
        // operadores de incremento o decremento
        System.out.println(+b);
        System.out.println(-b);
        System.out.println(++b);
        System.out.println(--b);

    }
}
