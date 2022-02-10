import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  try (Scanner entrada = new Scanner (System.in)) {
    int casos = entrada.nextInt();
    int v = 0;
    int acumulador = 0;
    while (v <= casos){
      int medicio = entrada.nextInt();
      acumulador = acumulador + medicio ;
      /* int min = Math.min(acumulador);
      int max = Math.max(acumulador); */

      v++;
  }
  System.out.println(acumulador);
  }

}
}
