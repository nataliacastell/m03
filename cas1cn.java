import java.util.Scanner;
//**
//* <h1>Calcul abonament parking</h1>
//* Calcula segons les tarifes dl parking el abonment per als clints
//*
//* @author  Natalia Castell
//* @since   2021-12-16
//*/
public class cas1cn {
  public static void cs1cn(String[] args)
  {
  // -------> Matricula
  //
  System.out.println(
  " Introdueix la matricula completa "
  );
  try (Scanner entrada = new Scanner (System.in)) {
    String matricula = entrada.nextLine();
    System.out.println(
    " Digues a quina hora i minut has arribat al estacionament (Primer la hora, desprès els minuts) "
    );
    int horaint = entrada.nextInt();
    int minutint = entrada.nextInt();
    /**
    * @paragram horaint
    * @paragram minutint
    **/
    // ------>Sortida
    //
    System.out.println(
    " Digues a quina hora i minut surtes del estacionament (Primer la hora, desprès els minuts) "
    );
    int horaout = entrada.nextInt();
    int minutout = entrada.nextInt();
    /**
    * @paragram horaout
    * @paragram minutout
    **/
    // -------->Temps estacionament
    //
//Cal emmagatzemar la relació entre hores i minuts en una constant entera.
    int hora = horaout*60 - horaint*60;
    int horaprint = horaout - horaint;
    int minut = minutout - minutint;
    int tempsall = hora + minut;
    /**
    * @paragram hora
    * @paragram minut
    * @horaprint
    * @tempsall
    **/
    //int minutprint = tempsall-(horaprint*60);
    System.out.println(
    " Has estat aparca " + horaprint + " hora i " + minut + " minuts"
    ) ;
    // ------->lindar bonificació
    //
//Cal emmagatzemar en una variable entera el número total de minuts que el cotxe ha estat estacionat.
    boolean bono1 = tempsall <= 2;
    boolean bono2 = tempsall > 2;
    /**
    * @paragram bono1
    * @paragram bono2
    **/
    System.out.println(
    " Es menor o igual a 2 " + bono1
    );
     System.out.println(
    " Es major a 2 " + bono2
    );
    //-------->Cost
    //
//Cal emmagatzemar el cost d'estacionament per minut en cèntims i en una variable de tipus enter.
    int cost = tempsall * 2;
//Cal emmagatzemar el llindar de bonificació en hores i en una variable de tipus enter.
    int costbono = cost - 4;
    /**
    * @paragram cost
    * @paragram costbono
    **/
    System.out.println(
    " El cost amb bonificació " + (double)costbono/100
    );
     System.out.println(
    " El cost sense bonificació " + (double)cost/100
    );
    System.out.println(
    " La teva matricula es  " + matricula
    );
  }

  }
}
