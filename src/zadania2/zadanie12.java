package zadania2;

import java.util.Scanner;

public class zadanie12 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
     double powietrze =  343;
     double woda = 1490;
     double stal = 5100;

        double odleglosc;
        double czas;
        String material;

        System.out.println("podaj odleglosc");
        odleglosc = klawiatura.nextDouble();

        klawiatura.nextLine();

        System.out.println("Podaj material");
        material = klawiatura.nextLine();

        if( material.equals("powietrze")){
        czas = odleglosc / 343;
        System.out.println("czas to " + czas);
        }

        if( material.equals("stal")){
            czas = odleglosc / 5100;
            System.out.println("czas to " + czas);
        }

        if( material.equals("woda")){
            czas = odleglosc / 1490;
            System.out.println("czas to " + czas);
        }

    }
}
