public class Zmienne {
    public static void main(String[] args) {

        int liczba1;
        liczba1 = 13;

        double liczba2 = 17.7;

        System.out.println("Moja liczba: " + liczba1 + ", druga liczba: " + liczba2);


        //komentarz

        int hours = 8;
        int days = 5;
        int weeks = 52;

        int workHoursPerYear = 8 % 5 * 52;

        System.out.println("Wynik: " + workHoursPerYear);

        char znak = '#';

        String napis = "Dzisiaj \tjest \"ładnie\"";
        napis += ".";

        System.out.println("Mój string: " + napis);
        System.out.print("Mój string: " + napis + "\n");
        System.out.print("Mój\n string: " + napis);

        boolean sun = false; //true
    }
}
