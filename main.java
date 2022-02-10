import java.util.Scanner;
public class main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int casos;
		long num;
		long major = 0;
		long menor= 0;
		int repetitMenor = 0;
		int repetitMajor = 0;
		casos = s.nextInt();

		for(int i=0; i<casos; i++) {
		    num = s.nextLong();
		    menor = 0;
		    major = 0;

			while(num != 0) {
				if(num < menor) {
					menor = num;
					repetitMenor = 1;
          	System.out.print(  repetitMenor);
				}

        else if(menor == num) {
					repetitMenor++;
          	System.out.print(  repetitMenor);
				}

				if(num > major) {
					major = num;
					repetitMajor = 1;
          	System.out.print(  repetitMajor);
				}

        else if(major == num) {
					repetitMajor++;
          System.out.print(  repetitMajor);
				}
				num = s.nextLong();
			}
			//System.out.print( menor, repetitMenor, major, repetitMajor);//
		}
		s.close();
	}
}
