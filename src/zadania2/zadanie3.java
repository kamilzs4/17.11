package zadania2;

import java.util.Scanner;

public class zadanie3 {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);
        double waga;
        System.out.println("podaj swoja wage ");
        waga = klawiatura.nextDouble();

        double wzrost;
        System.out.println("podaj swoj wzrost w m");
        wzrost = klawiatura.nextDouble();

        double bmi;
        double potega;
        potega = wzrost * wzrost;
        bmi = waga / potega;
        System.out.println(bmi);

        if (bmi > 25) {
            System.out.println("Oznacza to nadwage");}

        if (bmi < 25){
            if(bmi > 18.5){
            System.out.println("Masz prawdilowa wage");
            }
        }

        if (bmi < 18.5){
           System.out.println("Masz niedowage");
        }


    }
}
