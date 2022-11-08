import java.util.Scanner;

public class zadanie17 {
    public static void main(String[] args) {


        Scanner klawiatura = new Scanner(System.in);


        double rachunek;
        System.out.println("Podaj wysokosc rachunku: ");
        rachunek = klawiatura.nextDouble();

        double podatek;
        podatek = 0.0675;
        double podatekPotrawy;
        podatekPotrawy = podatek * rachunek;
        double potrawazPodatkiem;
        potrawazPodatkiem = podatek + rachunek;
        double napiwek;
        napiwek = 0.2;
        double napiwekPotrawy;
        napiwekPotrawy = napiwek * potrawazPodatkiem;

        System.out.println("Cena potrawy: " + rachunek);
        System.out.println("Podatek z potrawy wynosi: " + podatekPotrawy);
        System.out.println("Wysokosc napiwek wynosi: " + napiwekPotrawy);
        double lacznakwota;
        lacznakwota = napiwekPotrawy + rachunek + podatekPotrawy;
        System.out.println("Laczna kwota wynosi " + lacznakwota);
        }
    }
