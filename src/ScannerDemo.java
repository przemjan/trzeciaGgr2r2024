import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);

        int numerButa;
        System.out.println("Podaj numer buta: ");
        numerButa = klawisz.nextInt();
        klawisz.nextLine();

        System.out.println("Podaj średnią z polskiego: ");
        double srednia = klawisz.nextDouble();
        klawisz.nextLine();

        System.out.println("Podaj imię: ");
        String name = klawisz.nextLine();

        System.out.println("Twój numer buta: " + numerButa + "średnia: " + srednia + ", imię: " + name);


    }
}
