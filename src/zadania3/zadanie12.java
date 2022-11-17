package zadania3;

public class zadanie12 {
    public static void main(String[] args) {
        int a, b;
        a = 1;
        b = 30;
        double wynik = 0;
        for (int i = 1, j = 30; i <= 30; i++, j--) {
            wynik += (double) i / j;

        }

        System.out.println("wynik to " + wynik);
    }
}
