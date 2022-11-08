public class zadanie18 {

    public static void main(String[] args) {
        int akcje;
        akcje = 600;
        double cenakacji;
        cenakacji = 21.77;
        double prowizja;
        prowizja = 0.02;


        double lacznakwota;
        lacznakwota = akcje * cenakacji;
        double wysokoscprowizji;
        wysokoscprowizji = prowizja * lacznakwota;



        double cenaZprowizja;
        cenaZprowizja = lacznakwota + wysokoscprowizji;

        System.out.println("Kwota za same akcje wynosi " + lacznakwota);
        System.out.println("Wysokosc prowizji wynosi: " + wysokoscprowizji);
        System.out.println("Laczna kwota z prowizja wynosi " + cenaZprowizja);





    }



}

