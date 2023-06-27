/*
Programa para resolver una ecuacion cuadratica
Diego Estrada-2019308
Fecha: 5/26/2022
*/
package arrays;
import java.util.Scanner; 
public class Arrays {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double[] num;
        num = new double[6];
        System.out.println("El programa resuleve ecuaciones cuadraticas");
        System.out.println("Ingrese solo los coeficientes de la ecuacion");
        System.out.println("Ingrese el valor del coeficiente a:");
        num[0]=leer.nextDouble();
        System.out.println("Ingrese el valor del coeficiente b:");
        num[1]=leer.nextDouble();
        System.out.println("Ingrese el valor del coeficiente c:");
        num[2]=leer.nextDouble();
        
         num[3] = (num[1]*num[1]) - (4*num[0]*num[2]);       
        if(num[3]>0){
            num[4]=(-num[1]+Math.sqrt(num[3])) / (2*num[0]);
            num[5]=(-num[1]-Math.sqrt(num[3])) / (2*num[0]);
            System.out.println("La solucion de x1: " + num[4]);
            System.out.println("La solucion de x2: " + num[5]);
            
        }else{
            if(num[3]==0){
               num[4]=(-num[1]+Math.sqrt(num[3])) / (2*num[0]);
               System.out.println("La ecuacion solo tiene una solcuion\nLa solucon es: "+num[4]);
               
            
            }else{
            System.out.println("Esta ecuacion no tiene solucion\nF");
            }
        }}}
 


        
    

