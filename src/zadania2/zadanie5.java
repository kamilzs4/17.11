package zadania2;

import java.util.Scanner;

public class zadanie5 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        double masa;
        System.out.println("podaj mase");
        masa = klawiatura.nextDouble();

        double ciezar;
        ciezar = masa * 9.8;

        if(ciezar > 1000){
            System.out.println("Obiekt jest ciezki");
        }
         if(ciezar <= 10){
            System.out.println("Obiekt jest lekki");
        }
         else{
             System.out.println("waga obiektu wynosi: " + ciezar + "N");
         }

    }
}
