package array_ncastell.examen8_febrer_Ncastell;

import java.util.Scanner;
//Utilitza un array per guardar les temperatures diàries de dues setmanes. 
//Calcular el valor mig dels valors guardats i imprimir-lo. 
//Imprimir quants números hi ha majors que el valor mitjà i la llista de números més grans que el mitjà.
public class Main{
    public static void main(String[] args){
      Scanner entrada = new Scanner(System.in);
      int vegades_temperatura= 0;
      int j= 0;
      int s= 0;
      int t= 0;
      int dos_setmanes= 14;
      int suma=0;
      //int mitjana=0;
      //tipo [] nombre-array= tipo nombre-array[];
     
      vegades_temperatura= entrada.nextInt();
      //System.out.println("vegades llegim " + vegades_temperatura);
      int x=dos_setmanes*vegades_temperatura;
      int [] temperatures= new int[x];
      double [] llista_major_mitjana= new double[x];

      //Si el nombre es menor a 0
      if(vegades_temperatura>0){
        while(t<dos_setmanes){
          //llegim les dades tantes vegades com sigui necessari
          while(j<dos_setmanes){
          //llegim i guardem a l'array
          temperatures[j]=entrada.nextInt();
          j++;      
          }
        t++;
        }
      }
      //Recorrem l'array
      for (int i=0; i<x; i++){
        //Fem la mitjana
        suma = suma + temperatures[i];
        //System.out.println("suma " + suma);
      }
      double mitjana= (double)suma/(double)x;
      System.out.println("La mitjana de temperatura de dos setmanes es de: "+ mitjana); 
      for (int e=0; e<x; e++){
        if(temperatures[e] > mitjana){
          llista_major_mitjana[e]= temperatures[e];
        }
      } 
      for (int e=0; e<x; e++){
        if(llista_major_mitjana[e]>mitjana)System.out.println("Els valor mes grans que la mitjana son: "+ llista_major_mitjana[e]);
      }     
      entrada.close();
  }
}