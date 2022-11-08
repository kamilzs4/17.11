package zadania2;

import java.util.Scanner;

public class zadanie4 {
    public static void main(String[] args) {

        double test1;
        double test2;
        double test3;
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("podaj wyniki z trzech testow");
        test1 = klawiatura.nextDouble();
        test2 = klawiatura.nextDouble();
        test3 = klawiatura.nextDouble();
        double srednia;
        srednia = test1 + test2 + test3;
        srednia = srednia / 3;
        System.out.println(srednia);

        if (srednia > 90) {
            System.out.println("5");
        } else if (srednia > 80) {
            System.out.println("4");
        } else if (srednia > 70) {
            System.out.println("3");
        } else if (srednia > 60) {
            System.out.println("2");
        } else if (srednia < 60) {
            System.out.println("1");
        }
        else{
            System.out.println("liczba sie nei zgadza");
        }


    }
}
