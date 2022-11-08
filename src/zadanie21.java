import java.util.Scanner;

public class zadanie21 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        double poczatkowakwota;
        System.out.println("Podaj poczatkowa kwote: ");
        poczatkowakwota = klawiatura.nextDouble();

        double rocznastopa;
        System.out.println("Podaj roczna stope oprocentowania: ");
        rocznastopa = klawiatura.nextDouble();

        double odsetkikapitalizacja;
        System.out.println("Podaj ile razy w roku odsetki sa kapitalizowane: ");
        odsetkikapitalizacja = klawiatura.nextDouble();

        double liczbalat;
        System.out.println("Podaj ilosc lat ile pieniadze maja znajdowac sie na koncie ");
        liczbalat = klawiatura.nextDouble();
        double potega;
        potega = odsetkikapitalizacja * liczbalat;
        double kwotakoncowa;
        kwotakoncowa = poczatkowakwota * (1 + rocznastopa / odsetkikapitalizacja);
        double potega2;
        potega2 = Math.pow(kwotakoncowa, potega);
        double kwotakoncowa2;
        kwotakoncowa2 = potega2;

        System.out.println("Kwota ostateczna wynosi: " + kwotakoncowa2);





    }



}
