package array_ncastell.calse26gener;

import java.util.Scanner;

public class pas4{
    public static void main(String[] args){
        try (Scanner teclat = new Scanner(System.in)) {
            int num_pilots = teclat.nextInt();
            int entreno = teclat.nextInt();
            double cent=0;
                double mes_60=0;
                double menos_60=0;
            /* Per guardar el millorPromig. Inicialitzar variables  */
            String nom_millor = "";
            double millor_promig = 10000;


            /* Bucle P vegades processar dades de tots els pilots */
            int comptador2 = 0;
            while(comptador2<num_pilots){
                /* AQUI: Comença COPIA del pas 2 */
                String nom_pilot = teclat.next();
                /* bucle per llegir E enters */
                int sumaTemps = 0;
                int numEnBO = 0;
                int comptador= 0;
                while(comptador<entreno){
                    int tempsentreno = teclat.nextInt();
                    sumaTemps += tempsentreno;    // suma dels temps
                    if(tempsentreno<=10){
                        numEnBO++;
                    }
                    comptador++;
                }

                /* Calcul promig */
                double tempsPromig = (double)sumaTemps/entreno;

                /* Calcular percentatge d'entrenos BO */
                double percent_bo = 100*(double)numEnBO/entreno;
                /* AQUI: acaba COPIA del pas 2 */
                /* Buscar millor promig (pas4) */

                if(millor_promig>tempsPromig){
                    millor_promig=tempsPromig;
                    nom_millor=nom_pilot;
                }
                /*Pas 5 a casa*/
                
                /*Comprova quants pilots tenen cert percentatge de entrenos bo */
                if(percent_bo==100){
                  cent++;
                }else if(percent_bo>=60 && percent_bo<100){
                  mes_60++;
                }else{
                  menos_60++;
                }
                /*Aqui acaba la part 5*/
                comptador2++;
            }
            /* Resultats  */
            System.out.println("Millor Pilot: " + nom_millor);
            System.out.println("Millor Promig: " + millor_promig);
            System.out.println("100% d'entrenos BO: " + cent);
            System.out.println("Entre el 60% i el 100% d'entrenos BO: " + mes_60);
            System.out.println("Menys del 60% d'entrenos BO: " + menos_60);
        }



    }
}
