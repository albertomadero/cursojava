import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Loops {
    public static void main(String[] args) {
        // Loops
        // - for controlado por contador

        for (int index = 0; index < 5; index++ ) {
            System.out.println("Hola, java");
        }

        // for controlado por longitud de array

        String[] names = {"Jesus", "Alberto", "Madero"};

        for (int index = 0; index < names.length; index++) {
            System.out.println(names[index]);
        }

        // forEach (Loop ideal para recorrer arrays o listas)
        for (String name : names){
            System.out.println(name);
        }

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        for (Integer number : numbers){
            System.out.println(number);
        }

        HashMap<String, String> emails = new HashMap<>();
        emails.put("Jesus", "jesus@hotmail.com");
        emails.put("Alberto", "alberto@gmail.com");
        emails.put("Juan", "juan@gmail.com");

        for (Map.Entry<String, String> email: emails.entrySet()){
            System.out.println("Nombre: " + email.getKey());
            System.out.println("E-mail: " + email.getValue());
        }

        // While / do-while
        int index = 0;
        while (index < 5) {
            System.out.println("Hola");
            index++;
        }

        index = 0;
        while (index < names.length) {
            System.out.println(names[index]);
            index++;
        }

        index = 0;
        boolean find = false;
        while (!find) {
            System.out.println(names[index]);
            if (names[index].equals("Alberto")) {
                find = true;
            }
            index++;
        }

        // do-while
        index = 0;
        do {
            System.out.println("Hola desde do");
            index++;
        } while (index < 1);

        // Control de bucles
        // - break
        for (String name: names) {
            if (name.equals("Alberto")) {
                break;
            }
            System.out.println(name);
        }

        // - Continue
    }
}
