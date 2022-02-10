package cas_1_1;
import java.util.Scanner;

public class programa_acabat {
	public static void main(String[] args) {

	        final int 	RTERRA = 6371;
	        final int 	RMERCURI = 2439;
	        final int 	RVENUS = 6051;
 	        final int 	RMART = 3389;  
 	        final double PI = 3.14;
 	        
 	        double vterra, vmercuri, vvenus, vmart;
 	        
 	        vterra = (4*PI*(RTERRA*RTERRA*RTERRA))/3;
 	        vmercuri = (4*PI*(RMERCURI*RMERCURI*RMERCURI))/3;
 	        vvenus = (4*PI*Math.pow(RVENUS,3))/3;
 	        vmart = (4*PI*(RMART*RMART*RMART))/3;
 	        
 	        System.out.println("Volums de la Terra, Mercuri, Venus i Mart");
 	        System.out.println("-------------------------------------------");
 	        
 	        System.out.println("El volum de la Terra es: " + vterra + " Km3");
 	        System.out.println("El volum de la Mercuri es: " + vmercuri + " Km3");
 	        System.out.println("El volum de la Venus es: " + vvenus + " Km3");
 	        System.out.println("El volum de la Mart es: " + vmart + " Km3");
 	        
 	       System.out.println("-------------------------------------------");
 	    	    
 	       double volum;
 	       double radi = 0;
 	       
 	       Scanner entrada = new Scanner ( System.in );
 	       
 	       System.out.print("Introdueix el diametre del meteorit ");
 	       
 	       radi = entrada.nextInt();
 	       
 	       System.out.println("El volum del meteorit es: ");
 	       volum=(4*PI*(radi*radi*radi))/3;
 	       
 	       System.out.println(volum + " Km3");
 	       
 	      System.out.println("-------------------------------------------");
 	       
 	      
 	    		//Aquestes variables són la distancia que hi ha des de la Terra als altres planetes.
 	    		int Mercuri = 77000000;
 	    		int Venus = 40000000;
 	    		int Mart = 255000000;
 	    		
 	    		//Variable per a la velocitat.
 	    		int velocitat;
 	    		
 	    		//Variable per als dies.
 	    		double dies = 0.41;
 	    		
 	    		//Variables per al temps dels planetes.
 	    		int tmercuri;
 	    		int tvenus;
 	    		int tmart;
 	    		
 	    		//Variables per a la probabilitat.
 	    		boolean pmercuri;
 	    		boolean pvenus;
 	    		boolean pmart;
 	    		
 	    		//Variable dies màxims per arribar vius.
 	    		int dviu = 500;
 	    		
 	    		//Farem que l'usuari pugui introduir la velocitat mitjançant un scanner.
 	    		Scanner keyboard = new Scanner(System.in);
 	    	    System.out.println("Introdueix la velocitat");
 	    	    velocitat = (int) keyboard.nextDouble();
 	    	    
 	    		//Calcularem el temps que tardarem en arribar als planetes.
 	    		tmercuri = (int) ((Mercuri / velocitat) * dies);
 	    		tvenus = (int) ((Venus / velocitat) * dies);
 	    		tmart = (int) ((Mart / velocitat)* dies);
 	    		
 	    		//Calcul per saber si arribem vius.
 	    		pmercuri = tmercuri < dviu;
 	    		pvenus = tvenus < dviu;
 	    		pmart = tmart < dviu;
 	    		
 	    		//És el missatge que mostrarà el programa,		
 	    	    System.out.println("Tardarem "+tmercuri +" dies en arribar a Mercuri. Arribarem vius? "+pmercuri);			
 	    		System.out.println("Tardarem "+tvenus +" dies en arribar a Venus. Arribarem vius? "+pvenus);			
 	    		System.out.println("Tardarem "+tmart +" dies en arribar a Mart. Arribarem vius? "+pmart);
	}
}

