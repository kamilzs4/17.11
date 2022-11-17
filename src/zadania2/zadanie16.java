package zadania2;

import java.util.Scanner;

public class zadanie16 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        int ksiazki;
        System.out.println("Podaj iloscz zakupionych ksiazek");
        ksiazki = klawiatura.nextInt();
        int punkty;

        if(ksiazki == 1)
        {
            punkty = 5;
            System.out.println("Dostajesz punktow: " + punkty);
        }

        else if (ksiazki == 2)
        {
            punkty = 15;
            System.out.println("Dostajesz punktow: " + punkty);
        }

        else if (ksiazki == 3)
        {
            punkty = 30;
            System.out.println("Dostajesz punktow: " + punkty);
        }

        else if (ksiazki >= 4)
        {
            punkty = 60;
            System.out.println("Dostajesz punktow: " + punkty);
        }





    }
}
