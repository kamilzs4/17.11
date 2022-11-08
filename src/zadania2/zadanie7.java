package zadania2;

import java.util.Scanner;

public class zadanie7 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        String imie1;
        String imie2;
        System.out.println("2 imiona");
        imie1 = klawiatura.nextLine();
        imie2 = klawiatura.nextLine();


        if (imie1.compareToIgnoreCase(imie2) < 0){
            System.out.println(imie1 + " jest pierwszy alfabetycznie  " );
            System.out.println(imie2 + " Jest drugie");
        }

        else if (imie1.compareTo(imie2) > 0){
            System.out.println(imie2 + " jest pierwszy alfabetycznie");
            System.out.println(imie1 + " Jest drugie");
        }


    }
}




