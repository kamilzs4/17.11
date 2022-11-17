package zadania2;

import java.util.Scanner;

public class zadanie15 {

    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        int podstawa = 10;
        double lacznie;

        System.out.println("Podaj ilos czekow");
        int iloscczekow;
        iloscczekow = klawiatura.nextInt();

        if(iloscczekow < 20)
        {
         lacznie = iloscczekow * 0.1;
         lacznie = lacznie + podstawa;
         System.out.println("Cena laczna wynosi " + lacznie);
        }
        else if(iloscczekow >= 20 && iloscczekow < 40)
        {
            lacznie = iloscczekow * 0.08;
            lacznie = lacznie + podstawa;
            System.out.println("Cena laczna wynosi " + lacznie);
        }
        else if(iloscczekow >= 40 && iloscczekow < 60)
        {
            lacznie = iloscczekow * 0.06;
            lacznie = lacznie + podstawa;
            System.out.println("Cena laczna wynosi " + lacznie);
        }
        else if(iloscczekow >= 60)
        {
            lacznie = iloscczekow * 0.04;
            lacznie = lacznie + podstawa;
            System.out.println("Cena laczna wynosi" + lacznie);
        }


    }
}
