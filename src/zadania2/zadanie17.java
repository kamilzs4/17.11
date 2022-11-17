package zadania2;

import java.util.Scanner;

public class zadanie17 {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);
        String r1, r2, r3, r4, r5;
        char weganin, wegetarianin, bezglutenowiec;

        r1 = "Luksusowe Burgery u Jarka";
        r2 = "Pizzeria przy Dworcowej";
        r3 = "Kawiarnia na Rogu";
        r4 = "Włoskie Specjały";
        r5 = "Kuchnia u Szefa";



        System.out.println("Jesteś wegetarianinem?);
        wegetarianin = klawiatura.next().charAt(0);

        System.out.println("Jesteś weganinem?);
        weganin = klawiatura.next().charAt(0);

        System.out.println("Jesteś bezglutenowcem? czy Nie?");
        bezglutenowiec = klawiatura.next().charAt(0);

        System.out.println("Pasujące restauracje:");
        if (wegetarianin == 'N' && weganin == 'N' && bezglutenowiec == 'N')
        {
            System.out.println("Przykładowa restauracja: " + r1);
            System.out.println("Przykładowa restauracja: " + r2);
            System.out.println("Przykładowa restauracja: " + r3);
            System.out.println("Przykładowa restauracja: " + r4);
            System.out.println("Przykładowa restauracja: " + r5);
        }
        else if (wegetarianin == 'T' && weganin == 'N' && bezglutenowiec == 'N')
        {
            System.out.println("Przykładowa restauracja: " + r4);
        }
        else if (wegetarianin == 'T' && weganin == 'T' && bezglutenowiec == 'T')
        {
            System.out.println("Przykładowa restauracja: " + r5);
        }
        else
        {
            System.out.println("Nie ma niestety wyboru");
        }
    }


    }

