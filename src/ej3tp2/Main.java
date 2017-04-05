package ej3tp2;

import java.util.Date;

public class Main {

	// Elijo los métodos de Burbujeo (Ejercicio 3) y MergeSort (Ejercicio 4)

	// ------------------------ EJERCICIOS 3 y 4 ----------------------

	final static int TAM = 200000;

	public static void main(String[] args) {

		int[] arreglo1 = new int[TAM];
		int[] arreglo2 = new int[TAM];
		Burbujeo ordenadorBurbujeo = new Burbujeo();

		for (int i = 0; i < TAM; i++) {
			int temp = (int) (Math.random() * 100000);
			arreglo1[i] = temp;
			arreglo2[i] = temp;
		}
		
		// Tomo fecha y hora de inicio antes del Burbujeo.
		Date inicioArray = new Date();
		ordenadorBurbujeo.ordenarPorBurbujeo(arreglo1);
		// Tomo fecha y hora de inicio después del Burbujeo.
		Date finalArray = new Date();

		MergeSort ordenamientoMergeSort = new MergeSort();
		// Tomo fecha y hora de inicio antes del MergeSort
		Date inicioMerge = new Date();
		// Realizo el ordenamiento
		ordenamientoMergeSort.sort(arreglo2);
		// Tomo fecha y hora de fin del MergeSort
		Date finalMerge = new Date();

		System.out.println();
		System.out.println(inicioArray);
		System.out.println(finalArray);

		// Calculo el tiempo con el arreglo ordenado por Burbujeo
		long resultadoArray = finalArray.getTime() - inicioArray.getTime();

		/* Si divido resultadoArray por 1000 logro ver cuántos segundos tarda.
		 con TAM = 100000 el burbujeo tarda unos 25 segundos. Con 200000 unos
		 99 segundos.*/

		System.out.println(resultadoArray + " milisegundos tardó el Ordenamiento por BURBUJEO");

		System.out.println();
		System.out.println(inicioMerge);
		System.out.println(finalMerge);

		/*
		  Si divido resultadoMerge por 1000 lograría ver cuántos segundos
		  tarda. Sin embargo, es tan rápido el Algoritmo que es necesario
		  aumentar varias veces el tamaño del arreglo para lograr ver una
		  diferencia en el tiempo. Entonces preferí dejar el valor en
		  milisegundos para que se pueda apreciar.
		  
		 */
		
		// Calculo el tiempo con el arreglo ordenado por MergeSort
		
		long resultadoMerge = finalMerge.getTime() - inicioMerge.getTime();
		System.out.println(resultadoMerge + " milisegundos tardó el Ordenamiento por MERGESORT");

		// Si dividiera por 1000 me daría los segundos, pero no sería
		// apreciable.:
		// System.out.println(resultadoMerge/1000 + " milisegundos tardó el
		// Ordenamiento por MERGESORT");

		System.out.println("");
		System.out.println("Arreglo 1 Final Ordenado por Burbujeo");
		
		for (int i = 0; i < 1000; i++) {
			System.out.print(arreglo1[i] + " - ");
		}
		
		System.out.println("");
		System.out.println("Arreglo 2 Final Ordenado por MergeSort");
		
		for (int i = 0; i < 1000; i++) {
			System.out.print(arreglo2[i] + " - ");
		}

		/*
		 * Conclusión:
		 * 
		 * Dada la complejidad de cada método de ordenamiento: Burbujeo: O(n^2)
		 * MergeSort: O(n * log_2 (n) ) Los resultados expuestos por pantalla
		 * reflejan la diferencia de tiempos de procesamiento, siendo los
		 * tiempos mucho mayores con el Burbujeo.
		 */
	}
}