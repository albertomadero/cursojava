package basic.c05_structures;

/*
Clase 44 - Ejercicios: Estructuras
Vídeo: https://youtu.be/JOAqpdM36wI?t=15680
*/

import java.awt.*;
import java.util.*;
import java.util.Arrays;
import java.util.List;

public class StructuresExercises {

    public static void main(String[] args) {

        // 1. Crea un Array con 5 valores e imprime su longitud.
        //int [] numbers = new int[2];
        Integer [] numeros = {1,5,10,15,20};
        System.out.println(numeros.length);
        // 2. Modifica uno de los valores del Array e imprime el valor del índice antes y después de modificarlo.
        System.out.println(numeros[2]);
        numeros[2] = 12;
        System.out.println(numeros[2]);
        // 3. Crea un ArrayList vacío.
        var names = new ArrayList<String>();
        // 4. Añade 4 valores al ArrayList y elimina uno a continuación.
        names.add("Uno");
        names.add("Dos");
        names.add("Tres");
        names.add("Cuatro");
        names.remove(2);
        System.out.println(names);
        // 5. Crea un HashSet con 2 valores diferentes.
        var palabras = new HashSet<String>();
        palabras.add("Hola");
        palabras.add("Mejor");
        // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet.
        palabras.add("Hola");
        palabras.add("Como");
        // 7. Elimina uno de los elementos del HashSet.
        palabras.remove("Mejor");
        // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de teléfono. Añade tres contactos.
        var telefonos  = new HashMap<String, Long>();
        telefonos.put("Alberto", 3330069641L);
        telefonos.put("Juan", 3304020198L);
        telefonos.put("Jesus", 3398789007L);
        //System.out.println(telefonos);
        // 9. Modifica uno de los contactos y elimina otro.
        telefonos.replace("Jesus", 3357461625L);
        telefonos.remove("Juan");
        // 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet y finalmente en un HashMap con clave y valor iguales.
        // Transformar Array en ArrayList
        List<Integer> numerosList = new ArrayList<>(Arrays.asList(numeros));
        System.out.println(numerosList);
        numerosList.add(25);
        System.out.println(numerosList);
        // Transformar Array en HashSet
        Set<Integer> numerosSet = new HashSet<>(Arrays.asList(numeros));
        System.out.println(numerosList);
        // Transformar Array en HashMap
        // Map<Integer, Integer> numerosMap = new HashMap();
        var numerosMap = new HashMap<Integer, Integer>();

        for (int num : numeros){
            numerosMap.put(num, num);
        }

        System.out.println(numerosMap);
    }
}
