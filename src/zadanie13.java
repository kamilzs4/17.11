import java.util.Scanner;

public class zadanie13 {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);

        double test1;
        System.out.println("Podaj wyniku pierwszego testu: ");
        test1 = klawiatura.nextDouble();
        klawiatura.nextLine();
        System.out.println(("Wynik pierwszego testu: " + test1));

        double test2;
        System.out.println("Podaj wyniku drugiego testu: ");
        test2 = klawiatura.nextDouble();
        klawiatura.nextLine();
        System.out.println("Wynik drugiego testu: " + test2);

        double test3;
        System.out.println("Podaj wyniku trzeciego testu: ");
        test3 = klawiatura.nextDouble();
        klawiatura.nextLine();
        System.out.println("Wynik trzeciego testu: " + test3);

        int numberOfTest;
        numberOfTest = 3;
        double averageTest;
        double alltest;
        alltest = test1 + test2 + test3;
        averageTest = alltest / numberOfTest;
        System.out.println("Sredni wynik z testow to: " + averageTest);


    }
}
