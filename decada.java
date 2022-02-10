@author Natalia Castell
import java.util.Scanner;
 
public class decade {
 public static void main(String[] args) {
   Scanner entrada = new Scanner(System.in);
   int any1;
   int any2;
   while (entrada.hasNextLine()){
     if (entrada.hasNextInt()){
       any1=entrada.nextInt();
       any2=entrada.nextInt();
       if((any1 >= 0 && any2 >= 0)&&(any1 <= 10000 && any2 <= 10000)){
         if(any1 <= any2){
           int resultat = (((any2 - any1)+1) % 10 );
           if (resultat == 0){
             System.out.println ("FELIZ DECADA NUEVA");
           }else{
             System.out.println ("TOCA ESPERAR");
           }
         }
       }
     }else{
       try {
         entrada.next();
       } catch (Exception e) {
       }
     }
   }
 }
}   
