import java.util.Scanner;
class main {
  public static void main(String[] args) {
  try (Scanner entrada = new Scanner (System.in)) {
    int casos = entrada.nextInt();
    int v = 1;
    while (v <= casos){
      int compartiments = entrada.nextInt();
      int mesgran = entrada.nextInt();
      int capacitat = compartiments * mesgran;
      int contador = 2;
      int sumadiferencia1 =  0;
      int resta = 0 ;
      while (contador == compartiments){
        contador ++ ;
        int sumadiferencia2 = +10;
        resta= sumadiferencia1+sumadiferencia2;
      }
      int total = capacitat - resta;
      System.out.println(total);

  }
  }
}
}
