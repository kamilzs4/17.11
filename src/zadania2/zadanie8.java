package zadania2;

import java.util.Scanner;

public class zadanie8 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        double liczbapakietow;
        System.out.println("podaj ilosc zakupionych pakietow");
        liczbapakietow = klawiatura.nextDouble();


        if (liczbapakietow < 10) {
            System.out.println("Nie dostajesz rabatu");
        } else if (liczbapakietow < 20) {
            System.out.print("Dostajesz 20% rabatu ");
        } else if (liczbapakietow < 50) {
            System.out.print("Dostajesz 30% rabatu");
        } else if (liczbapakietow < 100) {
            System.out.print("Dostajesz 40% rabatu");}
        else if(liczbapakietow > 100){
            System.out.print("50%");
        }

    }
}
