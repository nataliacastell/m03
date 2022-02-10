package array_ncastell.calse26gener;

import java.util.Scanner;
//Escriu un programa que llegeixi una seqüència no buida de nombres enters i indiqui quants d'ells són iguals a l'últim.
//Entrada
//L'entrada consisteix en un nombre natural n> 0, seguit de n nombres enters.
//Sortida
//Imprimeix el nombre d'elements que són iguals al darrer, exclòs aquest.
public class array_comparar{
    public static void main(String[] args){
      Scanner entrada = new Scanner(System.in);
      int numero_vegades= 0;
      int i= 0;
      int j= 0;
      int s= 0;
      //tipo [] nombre-array= tipo nombre-array[];
      int []buscar_aqui= new int[i];
      //nombre natural n> 0
      numero_vegades= entrada.nextInt();
      //Si el nombre es menor a 0
      if(numero_vegades<0){
        //llegim les dades tantes vegades com sigui necessari
        while(numero_vegades<=j){
        j++;
        //llegim i guardem a l'array
        buscar_aqui[i]=entrada.nextInt();      
        }
      }
      //Recorrem l'array
      for (i=0; i<buscar_aqui[i]; i++){
        //Comparem la posició i de l'array amb l'ultima posició
        if(buscar_aqui[i]==buscar_aqui[numero_vegades-1]){
          //contem quants hi han de repetits
          s++;
        }
      }
      System.out.println("Hem trobat " + s + " vegades el ultim nombre introduit" ); 
      entrada.close();
  }
}