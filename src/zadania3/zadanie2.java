package zadania3;

import java.util.Scanner;

public class zadanie2 {
    public static void main(String[] args) {
        boolean twierdzenie =true;
        Scanner scan = new Scanner(System.in);
        char litera;
        String pobrac;


        while (twierdzenie) {

            System.out.println("Podaj litere");
            pobrac = scan.nextLine();
            litera = pobrac.charAt(0);

            if(litera == 'T' || litera == 't' || litera == 'n' || litera == 'N' ) {
                twierdzenie = false;
            }else {
                twierdzenie = true;

            }

            System.out.println("Podałeś "+ litera);


        }
        System.out.println("Wyszedłem z pętli.");



    }
}
