package zadania2;

import java.util.Scanner;

public class zadanie11 {

    public static void main(String[] args) {


        Scanner klawiatura = new Scanner(System.in);
        String imie1;
        double czas1;
        System.out.println("podaj nazwisko i czas biegu");
        imie1 = klawiatura.nextLine();
        czas1 = klawiatura.nextDouble();
        klawiatura.nextLine();


        String imie2;
        double czas2;
        System.out.println("podaj nazwisko i czas biegu");
        imie2 = klawiatura.nextLine();
        czas2 = klawiatura.nextDouble();
        klawiatura.nextLine();


        String imie3;
        double czas3;
        System.out.println("podaj nazwisko i czas biegu ");
        imie3 = klawiatura.nextLine();
        czas3 = klawiatura.nextDouble();

        if(czas1<czas2 && czas2<czas3){
            System.out.println(imie1+imie2+imie3);
        }

        else if(czas1<czas2 && czas2>czas3){
            System.out.println(imie1+imie3+imie2);
        }
        else if(czas1<czas2 && czas2<czas3){
            System.out.println(imie1+imie2+imie3);
        }
        else if(czas1>czas2 && czas1<czas3){
            System.out.println(imie2+imie1+imie3);
        }
        else if(czas1>czas2 && czas3<czas1){
            System.out.println(imie2+imie3+imie1);
        }
        else if(czas3<czas2 && czas2<czas1){
            System.out.println(imie3+imie2+imie1);
        }
        else if(czas3<czas2 && czas2>czas1){
            System.out.println(imie3+imie1+imie2);
        }


    }
}
