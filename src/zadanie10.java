import java.util.Scanner;

public class zadanie10 {
    public static void main(String[] args) {


        Scanner klawiatura = new Scanner(System.in);

        double wartoscprod;

        System.out.println("Podaj wartosc produkt: ");
        wartoscprod = klawiatura.nextDouble();
        klawiatura.nextLine();

        double podatekStanowy;
        podatekStanowy = 0.04;
        double podatekLokalny;
        podatekLokalny = 0.02;

        double wynikPodatekStanowy;
        wynikPodatekStanowy = podatekStanowy * wartoscprod;
        System.out.println("Podatek stanowy z produktu wynosi: " + wynikPodatekStanowy);
        double wynikPodatekLokalny;
        wynikPodatekLokalny = podatekLokalny * wartoscprod;
        System.out.println(("Podatek lokalny z produktu wynosi: " + wynikPodatekLokalny));

        double allprice;
        allprice = wynikPodatekLokalny + wynikPodatekStanowy + wartoscprod;
        System.out.println("Po dodaniu podatku wartosc wynosi " + allprice);




    }



}
