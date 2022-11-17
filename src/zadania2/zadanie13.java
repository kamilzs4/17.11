package zadania2;

import java.util.Scanner;

public class zadanie13 {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);

        double pakietA = 39.99;
        double pakietB = 59.99;
        double pakietC = 69.99;

        double liczbamin;
        double liczbamin2;

        System.out.println("Podaj liczbe min");
        liczbamin = klawiatura.nextDouble();
        klawiatura.nextLine();

        System.out.println("Podaj litere pakietu ");
        String literapakietu;
        literapakietu = klawiatura.nextLine();


        if (literapakietu.equals("C")) {
            System.out.println("cena wynosi 69,99");
        }



        if (literapakietu.equals("A")) {
            if (liczbamin <= 450) {
                System.out.println("Cena wynosi 39,99");
            } else {

                liczbamin2 = liczbamin - 450;
                liczbamin2 = liczbamin2 * 0.45;
                liczbamin2 = pakietA + liczbamin2;
                System.out.println("Cena wynosi " + liczbamin2);
            }
        }


            if (literapakietu.equals("B")) {
                if (liczbamin <= 900) {
                    System.out.println("Cena wynosi 59,99");
                } else {

                    liczbamin2 = liczbamin - 900;
                    liczbamin2 = liczbamin2 * 0.45;
                    liczbamin2 = pakietB + liczbamin2;
                    System.out.println("Cena wynosi " + liczbamin2);
                }
            }

        }
    }
