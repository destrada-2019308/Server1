/*
Programa para calcualr la raiz cuadrada de un numero 
Diego Estrada - 2022
Fecha: 30 d emayo de 2022
*/
package org.diegoestrada.repaso; //javac -d . Repaso.java  Esto es para correr java 
//Para compiarlo se usa org.diegoestrada.repaso.Repaso 
import java.util.Scanner;
public class Repaso{
public static void main(String[] args) {

Scanner entrada;
double [] datos; 

entrada = new Scanner(System.in);
datos = new double[3];

System.out.println("Program halla la raiz cuadrada de un numero");
System.out.println("Ingrese el numero al que qiere hallar su raiz");
datos[0]= entrada.nextDouble();

if(datos[0]<0){

	datos [0]= datos[0]*(-1);
	datos[1]=Math.sqrt(datos[0]);
	datos[2]= datos[1]*(-1);


	System.out.println("La raiz cuadrada positiva es"+datos[1] +"i");
	System.out.println("La raiz cuadrada negativa es"+datos[2] +"i");

}else{
datos[1]= Math.sqrt(datos[0]);
datos[2]= datos[1]*(-1);

System.out.println("La raiz cuadrada positiva es:" +datos[1]);
System.out.println("La raiz cuadrada negativa es:" +datos[2]);
}


}
}