package ordenamiento;

import java.util.Random;

public class OrdenAleatorio {

    public static void main(String[] args) {
        Ordenamiento o = new Ordenamiento();
        Pelicula[] peliculas, mergeSortArray, quickSortarray, insertionSortArray, bubbleSortArray;
        long s, promTimeMerge = 0, promTimeInsertion = 0, auxTime, promTimeQuick = 0, promTimeBubble = 0;
        Random rndn = new Random();
        int aux, auxCount, promCountInsertion = 0, promCountMerge = 0, promCountQuick = 0, promCountBubble = 0;

        for (int i = 0; i < 30; i++) {
            aux = rndn.nextInt(10500);
            peliculas = o.creaArrRndn(aux);
            mergeSortArray = peliculas;
            quickSortarray = peliculas;
            insertionSortArray = peliculas;
            bubbleSortArray = peliculas;
            System.out.println("\nPARA: " + aux + " PELICULAS.");

            System.out.println("\nInsertionSort.");
            s = System.currentTimeMillis();
            auxCount = o.insertionSort(insertionSortArray);
            auxTime = (System.currentTimeMillis() - s);
            promTimeInsertion = auxTime + promTimeInsertion;
            promCountInsertion = auxCount + promCountInsertion;
            System.out.println("Número de Comparaciones: " + auxCount);
            System.out.println("Tiempo: " + auxTime + " ms. ");

            System.out.println("\nMergeSort.");
            s = System.currentTimeMillis();
            o.mergeSort(mergeSortArray);
            auxTime = (System.currentTimeMillis() - s);
            promTimeMerge = auxTime + promTimeMerge;
            auxCount = o.comparaciones;
            promCountMerge = auxCount + promCountMerge;
            System.out.println("Número de Comparaciones: " + auxCount);
            System.out.println("Tiempo: " + auxTime + " ms. ");

            System.out.println("\nQuickSort.");
            s = System.currentTimeMillis();
            auxCount = o.quickSort(quickSortarray, 0, quickSortarray.length - 1);
            auxTime = (System.currentTimeMillis() - s);
            promCountQuick = auxCount + promCountQuick;
            promTimeQuick = auxTime + promTimeQuick;
            System.out.println("Número de Comparaciones: " + auxCount);
            System.out.println("Tiempo: " + auxTime + " ms. ");

            System.out.println("\nBubbleSort.");
            s = System.currentTimeMillis();
            auxCount = o.bubbleSort(bubbleSortArray);
            auxTime = (System.currentTimeMillis() - s);
            promCountBubble = auxCount + promCountBubble;
            promTimeBubble = auxTime + promTimeBubble;
            System.out.println("Número de Comparaciones: " + auxCount);
            System.out.println("Tiempo: " + auxTime + " ms. \n");
        }
        System.out.println("Promedio Comparaciones InsertionSort: " + (promCountInsertion = promCountInsertion / 30));
        System.out.println("Promedio Comparaciones BubbleSort: " + (promCountBubble = promCountBubble / 30));
        System.out.println("Promedio Comparaciones MergeSort: " + (promCountMerge = promCountMerge / 30));
        System.out.println("Promedio Comparaciones QuickSort: " + (promCountQuick = promCountQuick / 30));
        System.out.println("Promedio Tiempo QuickSort: " + (promTimeQuick = promTimeQuick / 30));
        System.out.println("Promedio Tiempo BubbleSort: " + (promTimeBubble = promTimeBubble / 30));
        System.out.println("Promedio Tiempo MergeSort: " + (promTimeMerge = promTimeMerge / 30));
        System.out.println("Promedio Tiempo InsertionSort: " + (promTimeInsertion = promTimeInsertion / 30));

    }
}
