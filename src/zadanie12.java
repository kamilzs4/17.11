import java.util.Scanner;

public class zadanie12 {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);

        double ateCookies;
        System.out.println("Podaj ilosc zjedzonych ciastek: ");
        ateCookies = klawiatura.nextDouble();
        klawiatura.nextLine();
        double kalorieNaPorcje;
        kalorieNaPorcje = 300;
        double caloriesPerCookie;
        caloriesPerCookie = kalorieNaPorcje / 4;
        double ateCalories;
        ateCalories = caloriesPerCookie * ateCookies;
        System.out.println("Zjadles kalorii: " + ateCalories);

    }

}