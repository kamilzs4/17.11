package zadania2;

import java.util.Scanner;

public class zadanie1 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        double liczby;
        System.out.println("Podaj liczbe z przedzialu 1-10: ");
        liczby = klawiatura.nextDouble();

        if (liczby == 10) {
            System.out.println("X");
        } else if (liczby == 9) {
            System.out.println("IX");
        } else if (liczby == 8) {
            System.out.println("VIII");
        } else if (liczby == 7) {
            System.out.println("VII");
        } else if (liczby == 6) {
            System.out.println("VI");
        } else if (liczby == 5) {
            System.out.println("V");
        } else if (liczby == 4) {
            System.out.println("IV");
        } else if (liczby == 3) {
            System.out.println("II");
        } else if (liczby == 2) {
            System.out.println("II");
        } else if (liczby == 1) {
            System.out.println("I");
        }
        else{
            System.out.println("liczba sie nei zgadza");
        }
    }
}





