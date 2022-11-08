public class zadanie19 {

    public static void main(String[] args) {
    int iloscankietowanych;
    iloscankietowanych = 12467;
    double procentcytrusowe;
    procentcytrusowe = 0.64;

    double procentraztygodniowo;
    procentraztygodniowo = 0.14;

    double osobykupraztygodniowo;
    osobykupraztygodniowo = iloscankietowanych * procentraztygodniowo;

    System.out.println("Osoby kupujace raz tygodniowe energetyka " + osobykupraztygodniowo);

    double preferujacecytrus;
    preferujacecytrus = procentcytrusowe * iloscankietowanych;
    System.out.println("Osoby ankietowane preferujace napoje cytrusowe " + preferujacecytrus);





    }



}




