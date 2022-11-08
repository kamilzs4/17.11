package zadania2;

import java.util.Scanner;

public class zadanie2 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        double dzien;
        System.out.println("dzien w formie liczby ");
        dzien = klawiatura.nextDouble();

        double miesiac;
        System.out.println("miesiac w formie liczby ");
        miesiac = klawiatura.nextDouble();

        double rok;
        System.out.println("ostatnie dwie cyfry roku w formie liczby ");
        rok = klawiatura.nextDouble();

        if(miesiac * dzien == rok){
            System.out.println("Data jest magiczna!");
        }
        else{
            System.out.println("Data nie jest magiczna");
        }




    }
}
