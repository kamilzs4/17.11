package zadania3;

import java.util.Scanner;

public class zadanie3 {
    public static void main(String[] args) {
        boolean twierdzenie =true;
        Scanner scan = new Scanner(System.in);
        String pobrac;




        while (twierdzenie) {

            System.out.println("Podaj slowo");
            pobrac = scan.nextLine();

            if(pobrac.equals("Tak")  || pobrac.equals("Nie")) {
                twierdzenie = false;
            }else {
                twierdzenie = true;

            }

            System.out.println("Podałeś "+ pobrac);


        }
        System.out.println("Wyszedłem z pętli.");




    }
}
