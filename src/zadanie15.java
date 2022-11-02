import java.util.Scanner;

public class zadanie15 {
    public static void main(String[] args) {


        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj ulubione miasto: ");
        String nazwamiasta = klawiatura.nextLine();

        int numbers = nazwamiasta.length();
        System.out.println("znaki w wyrazie: " + numbers);

        String duze;
        duze = nazwamiasta.toUpperCase();
        System.out.println(duze);

        String male;
        male = nazwamiasta.toLowerCase();
        System.out.println(male);

        char inicjal;
        inicjal = nazwamiasta.charAt(0);
        System.out.println(inicjal);

    }
}