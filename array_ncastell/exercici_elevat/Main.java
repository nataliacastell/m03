package array_ncastell.exercici_elevat;

import java.util.Scanner;
//Guardar 7 números en un vector 
//elevar-los al quadrat i guardar el resultat en un altre vector. 
//Imprimir el vector original i el resultat.
public class Main{
    public static void main(String[] args){
      try (Scanner entrada = new Scanner(System.in)) {
        int x= 7;
        double [] numeros= new double[x];
        double [] elevat= new double[x]; 
        for(int i=0; i<7; i++){
          numeros[i]= entrada.nextInt();
          //System.out.println("num natural: " + numeros[i]);

        }
        for(int i=0; i<7; i++){
          elevat[i]=Math.pow(numeros[i], 2);
          System.out.println("El numero original es " + numeros[i] +", aquest numero elevat al quadrat es: "+ elevat[i]);
        }
      }
    }
 }