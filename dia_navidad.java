import java.util.Scanner;
/**
* <h1>Feliz dia de navidad</h1>
* En el programa de Feliz dia de Navidad
*ens han demanat que l'usuari introdueixi
*un numero de proves que vols fer i tantes
*dates com numero de proves.
@author Natalia Castell
*/
public class dia_navidad {
  /**
  @param casos num proves.
  @param dia a comprovar
  @param mes a comprovar
  @param dian (dia nadal 25)
  @param mesn (mes nadal 12)
  @return SI
  @return NO
  */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int casos = entrada.nextInt();
        int vegades = 1;
        int dian = 25;
        int mesn = 12;
        while (casos >= vegades){
            vegades ++;
            int dia = entrada.nextInt();
            int mes = entrada.nextInt();
            if ((dian == dia) && (mesn == mes)){
                 System.out.println("SI");
            }
            else {
                 System.out.println("NO");
            }

        }
        entrada.close();
    }

}
