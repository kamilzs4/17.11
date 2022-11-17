package zadania2;

import java.util.Scanner;

public class zadanie10 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        double liczbakalorii;
        System.out.println("liczba kalorii");
        liczbakalorii = klawiatura.nextDouble();

        double gramfat;
        System.out.println("liczba gramow tluszcuz");
        gramfat = klawiatura.nextDouble();

        double procentkaloriiztluszczu;
        double kalorieztluszczu;
        kalorieztluszczu = gramfat * 9;

        procentkaloriiztluszczu = kalorieztluszczu / liczbakalorii;


        System.out.println("ilosc % tluszcuz" + procentkaloriiztluszczu);
        if(procentkaloriiztluszczu<0.3){
            System.out.println("Produkt jest niskotluszczowy");
        }






    }
}
