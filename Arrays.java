public class Arrays {
    public static void main(String[] args) {
        // Declarar Arrays
        int [] numbers = new int[3];
        int [] numeros = {1,2,3,4,5};
        System.out.println(numbers);

        String[] names = {"Jesus", "Alberto", "Madero"};
        System.out.println(names);

        // Acceder a los datos
        System.out.println(numbers[0]);
        System.out.println(names[0]);

        // Modificar datos
        numbers[0] = 1;
        numbers[1] = 10;
        numbers[2] = 20;

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        System.out.println(names[2]);
        names[2] = "Venegas";
        System.out.println(names[2]);

        System.out.println(names.length);
        names[2] = null;
        System.out.println(names[2]);
        System.out.println(names.length);

        // numbers[2] = null; Error

        // Array de boolens
        boolean[] booleans = new boolean[5];
        System.out.println(booleans[4]);

        System.out.println(numeros.length);
    }
}
