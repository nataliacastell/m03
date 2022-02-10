package array_ncastell;

import java.util.Scanner;
//Escriu un programa que llegeixi una seqüència no buida de nombres enters i indiqui quants d'ells són iguals a l'últim.
//Entrada
//L'entrada consisteix en un nombre natural n> 0, seguit de n nombres enters.
//Sortida
//Imprimeix el nombre d'elements que són iguals al darrer, exclòs aquest.
public class jutje_1_1{
    public static void main(String[] args){
      Scanner entrada = new Scanner(System.in);
      int numero_vegades= 0;
      int j= 0;
      int s= 0;
      //tipo [] nombre-array= tipo nombre-array[];
      //nombre natural n> 0
      numero_vegades= entrada.nextInt();
      //System.out.println("n " + numero_vegades);
      int [] buscar_aqui= new int[numero_vegades];
      //Si el nombre es menor a 0
      if(numero_vegades>0){
        //llegim les dades tantes vegades com sigui necessari
        while(j<numero_vegades){
        //llegim i guardem a l'array
        //System.out.println("n " + entrada.nextInt());
        buscar_aqui[j]=entrada.nextInt();
        j++;      
        }
      }
      //Recorrem l'array
      int ultim_valor= buscar_aqui[numero_vegades-1];
      for (int i=0; i<numero_vegades; i++){
        //System.out.println("valor " + buscar_aqui[i]);
        //Comparem la posició i de l'array amb l'ultima posició
        if(buscar_aqui[i]==ultim_valor){
          //contem quants hi han de repetits
          s++;
        }
      }
      System.out.println("L'ultim valor es "+ ultim_valor + " i l'hem trobat " + s + " vegades en l'array." ); 
      entrada.close();
  }
}