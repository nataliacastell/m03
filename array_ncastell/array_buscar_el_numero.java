package array_ncastell;

import java.util.Scanner;

public class array_buscar_el_numero{
    public static void main(String[] args){
        try (Scanner teclat = new Scanner(System.in)) {
          //Llegir numeros array
          //Array numeros on buscar
          int[] buscar_aqui= new int[6];
          int i = 0;
          // Bucle llegix 6 numeros
          while(i<6){
            // Llegir numero
            buscar_aqui[i]=teclat.nextInt();
            //Compta voltes al Bucle
            i++;
            // Si el numero buscat es troba en els llegits
          }
          int num_buscat = teclat.nextInt();
          for (i=0; i<buscar_aqui[i]; i++) {
            if(num_buscat==buscar_aqui[i]){
              System.out.println("Has acabat! L'has trobat en la posicio: " + (i)); 
              break;
            } else if (i==5){
              System.out.println("No s'ha trobat!");
              break;
            }
          }
        }
    }
}