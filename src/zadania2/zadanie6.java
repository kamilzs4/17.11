package zadania2;

import java.util.Scanner;

public class zadanie6 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        double liczbasekund;
        System.out.println("podaj ilosc sekund");
        liczbasekund = klawiatura.nextDouble();


        if (liczbasekund > 86400) {
            double dzien;
            dzien = liczbasekund / 86400;
            System.out.println("Liczba dni: " + dzien);
        } else if (liczbasekund > 3600) {
            double godziny;
            godziny = liczbasekund / 3600;
            System.out.print("Liczba godzin " + godziny);
        } else if (liczbasekund > 60) {
            double minuty;
            minuty = liczbasekund / 60;
            System.out.print("Liczba minut: " + minuty);
        }
    }
}


