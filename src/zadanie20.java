import java.util.Scanner;

public class zadanie20 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
    //skladniki na jedno ciastko
        double jednociastkocukr;
        jednociastkocukr = 1.5 / 48;

        double jednociastkomaslo;
        jednociastkomaslo = 1 / 48;

        double jednociastkomaka;
        jednociastkomaka = 2.75 / 48;

        double ciastka;
        System.out.println("Podaj ilosc ciastek: ");
        ciastka = klawiatura.nextDouble();

        double ilosccukr;
        ilosccukr = ciastka * jednociastkocukr;
        double iloscmaslo;
        iloscmaslo = ciastka * jednociastkomaslo;
        double iloscmaka;
        iloscmaka = ciastka * jednociastkomaka;

        System.out.println("Ilosc szklanek cukru: " + ilosccukr);
        System.out.println("Ilosc szklanek masla: " + iloscmaslo);
        System.out.println("Ilosc szklanek maki: " + iloscmaka);


    }




}


