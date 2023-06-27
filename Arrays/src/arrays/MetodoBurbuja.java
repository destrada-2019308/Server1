/*
Programa para ordenar numeros
Diego Estrada - 2022
Fecha: 30 d emayo de 2022
*/
package org.diegoestrada.burbuja;
import java.util.Scanner;
public class MetodoBurbuja{
	public static void main(String[] args) {
		Scanner leer;
		int []vector;
		int tamanio=0;
		int temporal = 0;

		leer = new Scanner(System.in);

		System.out.println("Ingrese el tamaño del arreglo:");
		tamanio = leer.nextInt();
		//hace una instancia del vector con el tamaño ingresado
		vector = new int[tamanio];

		for(int i=0 ; i <tamanio; i++){
			System.out.println("Ingrese el valor "+(i+1));
			vector[i] = leer.nextInt();

		}
		//fase de proceso del METODO BURBUJA 
		for(int i=0; i< tamanio; i++)
		for(int j=0; j< tamanio-1; j++){
			if (vector[j] > vector [j+1]){
				temporal = vector[j];
				vector[j] = vector[j+1];
				vector [j+1] = temporal;
			
		}
	}

			for(int i=0; i<tamanio; i++)
				System.out.println("Los valores ordenados son: "+vector[i]);

			
		}
}

