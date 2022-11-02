import java.util.Scanner;

public class zadanie11 {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);

        double literFuel;
        System.out.println("Podaj ilosc spalonych litrow paliwa: ");
        literFuel = klawiatura.nextDouble();
        klawiatura.nextLine();

        double kilometers;
        System.out.println("Podaj ilosc przejechanych kilometrow: ");
        kilometers = klawiatura.nextDouble();
        klawiatura.nextLine();

        double kilometersPerLitr;
        kilometersPerLitr = kilometers / literFuel;
        System.out.println("Kilometry przejechane na litrze: " + kilometersPerLitr);









    }





}
