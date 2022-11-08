public class zadanie5i6 {


    public static void main(String[] args) {
        int room1;
        int wym1a, wym1b;
        wym1a = 3;
        wym1b = 4;
        room1 = wym1a * wym1b;
        System.out.println("Pomieszczenie 1 ma wielkosc " + room1 + "m^2");
        double average1;
        average1 = room1 / 4;
        System.out.println("Powierzchnia przypadajaca na 1 osoby to " + average1);

        int room2;
        int wym2a, wym2b;
        wym2a = 3;
        wym2b = 4;
        room2 = wym2a * wym2b;
        System.out.println("Pomieszczenie 2 ma wielkosc " + room2 + "m^2");
        double average2;
        average2 = room2 / 4;
        System.out.println("Powierzchnia przypadajaca na 1 osoby to " + average2);

        int room3;
        int wym3a, wym3b;
        wym3a = 2;
        wym3b = 3;
        room3 = wym3a * wym3b;
        System.out.println("Pomieszczenie 3 ma wielkosc " + room3 + "m^2");
        double average3;
        average3 = room3 / 4;
        System.out.println("Powierzchnia przypadajaca na 1 osoby to " + average3);

        int room4;
        int wym4a, wym4b;
        wym4a = 2;
        wym4b = 2;
        room4 = wym4a * wym4b;
        System.out.println("Pomieszczenie 4 ma wielkosc " + room4 + "m^2");
        double average4;
        average4 = room4 / 4;
        System.out.println("Powierzchnia przypadajaca na 1 osoby to " + average4);

        double allrooms;
        allrooms = room1 + room2 + room3 + room4;
        double averageAllRooms;
        int osoby;
        osoby = 4;
        averageAllRooms = allrooms / osoby;
        System.out.println("powierzchnia przypadajaca na 1 osobe w calym mieszkaniu wynosi " + averageAllRooms);










    }
}
