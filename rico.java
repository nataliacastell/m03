import java.util.Scanner;

public class rico {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner (System.in)) {
            int casos = 0;
            int linea = 0;
            int compartiments = 0;
            int litres_mesgran = 0;
            int diferencia = 0;
            int litres = 0;
            boolean OK = true;
            try{
                casos = entrada.nextInt();
            }catch (Exception e) {}
            //System.out.println("Número de casos : "+casos);
            if (casos > 0) {
                do {
                    linea++;
                    OK = true;
                    compartiments = 0;
                    litres_mesgran = 0;
                    diferencia = 0;
                    //System.out.println(" Linea numero: " +linea);
                    if (entrada.hasNextInt()){
                        try{
                            compartiments = entrada.nextInt();
                        }catch (Exception e) {}
                    }else{
                        OK = false;
                    }
                    if (compartiments > 0){
                        if (entrada.hasNextInt()){
                            try{
                                litres_mesgran = entrada.nextInt();
                            }catch (Exception e) {}
                        }else{
                            OK = false;
                        }
                        if (compartiments == 1){
                            //System.out.println(compartiments+" "+litres_mesgran+" "+ diferencia);
                            System.out.println(litres_mesgran);
                            try{
                                diferencia = entrada.nextInt();
                            }catch (Exception e) {}
                            continue;
                        }
                        if (entrada.hasNextInt()){
                            try{
                                diferencia = entrada.nextInt();
                            }catch (Exception e) {}
                        }else{
                            OK = false;
                        }
                        //System.out.println(compartiments+" "+litres_mesgran+" "+ diferencia);
                        if ((compartiments > 1 && litres_mesgran > 0 && diferencia > 0 && litres_mesgran > diferencia)&&(compartiments <= 10000 && litres_mesgran <= 10000 && diferencia <= 10000)&&OK){
                            //System.out.println(compartiments+" "+litres_mesgran+" "+ diferencia);
                            litres = compartiments*litres_mesgran-diferencia*compartiments*(compartiments-1)/2;
                            System.out.println(litres);
                        //}else{
                            //System.out.println("Dades incorrectes!!");
                        }
                    }else{
                        //System.out.println("Linea en blanc o compartiments = 0 !!");
                        try{
                            entrada.nextLine();
                        }catch (Exception e) {}
                    }
                } while (linea < casos);
            }
        }
    }
}
