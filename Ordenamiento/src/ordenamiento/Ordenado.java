
package ordenamiento;


public class Ordenado {

    public static void main(String[] args) {
        Ordenamiento o = new Ordenamiento();
        Pelicula[] peliculas;
        long s;

        peliculas = o.creaArr(100);
        System.out.println("Para 100 peliculas:");
        //o.imprimeArr(peliculas);
        System.out.println("\nInsertionSort.");
        s = System.currentTimeMillis();
        System.out.println("Número de Comparaciones: " + o.insertionSort(peliculas));
        System.out.println("Tiempo: " + (System.currentTimeMillis() - s) + " ms. ");
        System.out.println("\nMergeSort.");
        s = System.currentTimeMillis();
        o.mergeSort(peliculas);
        s = (System.currentTimeMillis() - s);
        System.out.println("Número de Comparaciones: " + o.comparaciones);
        System.out.println("Tiempo: " + s + " ms. ");
        System.out.println("\nQuickSort.");
        s = System.currentTimeMillis();
        System.out.println("Número de Comparaciones: " + o.quickSort(peliculas, 0, peliculas.length - 1));
        System.out.println("Tiempo: " + (System.currentTimeMillis() - s) + " ms. ");
        System.out.println("\nBubbleSort.");
        s = System.currentTimeMillis();
        System.out.println("Número de Comparaciones: " + o.bubbleSort(peliculas));
        System.out.println("Tiempo: " + (System.currentTimeMillis() - s) + " ms. ");
        //o.imprimeArr(peliculas);

        peliculas = o.creaArr(1000);
        System.out.println("\n\nPara 1,000 peliculas:");
        //o.imprimeArr(peliculas);
        System.out.println("\nInsertionSort.");
        s = System.currentTimeMillis();
        System.out.println("Número de Comparaciones: " + o.insertionSort(peliculas));
        System.out.println("Tiempo: " + (System.currentTimeMillis() - s) + " ms. ");
        System.out.println("\nMergeSort.");
        s = System.currentTimeMillis();
        o.mergeSort(peliculas);
        s = (System.currentTimeMillis() - s);
        System.out.println("Número de Comparaciones: " + o.comparaciones);
        System.out.println("Tiempo: " + s + " ms. ");
        System.out.println("\nQuickSort.");
        s = System.currentTimeMillis();
        System.out.println("Número de Comparaciones: " + o.quickSort(peliculas, 0, peliculas.length - 1));
        System.out.println("Tiempo: " + (System.currentTimeMillis() - s) + " ms. ");
        System.out.println("\nBubbleSort.");
        s = System.currentTimeMillis();
        System.out.println("Número de Comparaciones: " + o.bubbleSort(peliculas));
        System.out.println("Tiempo: " + (System.currentTimeMillis() - s) + " ms. ");
        //o.imprimeArr(peliculas);

        peliculas = o.creaArr(10000);
        System.out.println("\n\nPara 10,000 peliculas:");
        //o.imprimeArr(peliculas);
        System.out.println("\nInsertionSort.");
        s = System.currentTimeMillis();
        System.out.println("Número de Comparaciones: " + o.insertionSort(peliculas));
        System.out.println("Tiempo: " + (System.currentTimeMillis() - s) + " ms. ");
        System.out.println("\nMergeSort.");
        s = System.currentTimeMillis();
        o.mergeSort(peliculas);
        s = (System.currentTimeMillis() - s);
        System.out.println("Número de Comparaciones: " + o.comparaciones);
        System.out.println("Tiempo: " + s + " ms. ");
        System.out.println("\nQuickSort.");
        s = System.currentTimeMillis();
        System.out.println("Número de Comparaciones: " + o.quickSort(peliculas, 0, peliculas.length - 1));
        System.out.println("Tiempo: " + (System.currentTimeMillis() - s) + " ms. ");
        System.out.println("\nBubbleSort.");
        s = System.currentTimeMillis();
        System.out.println("Número de Comparaciones: " + o.bubbleSort(peliculas));
        System.out.println("Tiempo: " + (System.currentTimeMillis() - s) + " ms. ");
        //o.imprimeArr(peliculas);
    }
}
