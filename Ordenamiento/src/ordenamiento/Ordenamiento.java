
package ordenamiento;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ordenamiento<T extends Comparable<T>> {

    public int comparaciones = 0;
    public static ArrayList peliculas = new ArrayList();

    public Ordenamiento() {
        cargaDatos();
    }

    public int bubbleSort(T[] arr) {
        boolean bandera = true;
        int j = 0, cont = 0;
        T aux;
        while (bandera) {
            bandera = false;
            j++;
            for (int i = 0; i < arr.length - j; i++) {
                cont++;
                if (arr[i].compareTo(arr[i + 1]) > 0) {
                    aux = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = aux;
                    bandera = true;
                }
            }
        }
        return cont;
    }

    public int insertionSort(T[] arr) {
        int j, cont = 0;
        T aux;
        for (int i = 1; i < arr.length; i++) {
            aux = arr[i];
            j = i;
            cont++;
            while (j > 0 && arr[j - 1].compareTo(aux) > 0) {
                arr[j] = arr[j - 1];
                j--;
            }
            if (j < 0) {
                cont--;

            }
            arr[j] = aux;
        }
        return cont;
    }

    public int quickSort(T a[], int izq, int der) {//izq=0, der=a.lenght-1
        T pivote = a[izq]; // tomamos primer elemento como pivote
        int i = izq; // i realiza la búsqueda de izquierda a derecha
        int j = der; // j realiza la búsqueda de derecha a izquierda
        T aux;
        int cont = 0;

        while (i < j) { // mientras no se crucen las búsquedas
            while (a[i].compareTo(pivote) <= 0 && i < j) {
                cont++;
                i++; // busca elemento mayor que pivote
            }
            cont++;
            while (a[j].compareTo(pivote) > 0) {
                cont++;
                j--; // busca elemento menor que pivote
            }
            if (i < j) {  // si no se han cruzado los intercambia            
                aux = a[i];// los intercambia
                a[i] = a[j];
                a[j] = aux;
            }
        }
        a[izq] = a[j]; // se coloca el pivote en su lugar de forma que tendremos
        a[j] = pivote; // los menores a su izquierda y los mayores a su derecha
        if (izq < j - 1) {
            quickSort(a, izq, j - 1); // ordenamos subarray izquierdo
        }
        if (j + 1 < der) {
            quickSort(a, j + 1, der); // ordenamos subarray derecho
        }
        
        return cont;
    }

    public void mergeSort(T[] a) {
        this.comparaciones=0;
        Comparable[] tmp = new Comparable[a.length];
        mergeSort(a, (T[]) tmp, 0, a.length - 1);
    }

    private void mergeSort(T[] a, T[] tmp, int left, int right) {
        if (left < right) {
            int center = (left + right) / 2;
            mergeSort(a, tmp, left, center);
            mergeSort(a, tmp, center + 1, right);
            merge(a, tmp, left, center + 1, right);
        }

    }

    protected void merge(T[] a, T[] tmp, int left, int right, int rightEnd) {
        int leftEnd = right - 1;
        int k = left;
        int num = rightEnd - left + 1;

        while (left <= leftEnd && right <= rightEnd) {
            comparaciones++;
            if (a[left].compareTo(a[right]) <= 0) {
                tmp[k++] = a[left++];
            } else {
                tmp[k++] = a[right++];
            }
        }
        while (left <= leftEnd) {    // Copia el resto de la primer mitar
            tmp[k++] = a[left++];
        }
        while (right <= rightEnd) {  // Copia el resto de la mitad derecha
            tmp[k++] = a[right++];
        }
        // Copia tmp de nuevo
        for (int i = 0; i < num; i++, rightEnd--) {
            a[rightEnd] = tmp[rightEnd];
        }
    }

    private static void cargaDatos() {
        String linea, nombre;
        Pelicula p;
        int id, año;
        Scanner lec = null;
        File ent = new File("peliculas.txt");
        String datosPelicula[];

        try {
            lec = new Scanner(ent);
        } catch (FileNotFoundException fnfe) {
            System.err.println("ERROR" + fnfe);
        }

        linea = "";
        while (lec.hasNextLine()) {
            linea = lec.nextLine();
            datosPelicula = linea.split("\\,");
            if (datosPelicula.length == 3) {
                id = Integer.parseInt(datosPelicula[0]);
                año = Integer.parseInt(datosPelicula[1]);
                nombre = datosPelicula[2];
                p = new Pelicula(id, año, nombre);
                peliculas.add(p);
            }
        }
        lec.close();
    }

    public Pelicula[] creaArrRndn(int cuantas) {
        Pelicula[] p = new Pelicula[cuantas];
        Random rndn = new Random();
        int aux;
        
        for (int i = 0; i < cuantas; i++) {
            aux=rndn.nextInt(peliculas.size());
            p[i] = (Pelicula) peliculas.get(aux);
        }

        return p;
    }

    public void imprimeArr(T[] arr ){
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i].toString() + "  ");
        }
        System.out.print("]\n");
    }

    public Pelicula[] creaArr(int cuantas) {
        Pelicula[] p = new Pelicula[cuantas];
        
        for (int i = 0; i < cuantas; i++) {
            p[i] = (Pelicula) peliculas.get(i);
        }

        return p;}
    
    protected void bubbleSortInv(T[] arr) {
        boolean bandera = true;
        int j = 0, cont=0;
        T aux;
        while (bandera) {
            bandera = false;
            j++;
            for (int i = 0; i < arr.length - j; i++) {
                cont++;    
                if (arr[i].compareTo(arr[i + 1]) < 0) {                          
                    aux = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = aux;
                    bandera = true;
                }
            }
        }
    }
}
