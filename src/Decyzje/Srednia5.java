package Decyzje;

public class Srednia5 {
    public static void main(String[] args) {
        int ocena1 = 6,  ocena2 = 6;
        int iloscOcen = 2;

        double srednia;
        srednia = (ocena1 + ocena2) / (double)iloscOcen;

        //błędny przykład
        if (srednia > 2) {
            System.out.println("Bardzo źle " + srednia);
        }
        else if (srednia >= 2) {
            System.out.println("Kiepsko" + srednia);
        }
        else if (srednia > 3) {
            System.out.println("Średnio " + srednia);
        }
        else if (srednia > 4) {
            System.out.println("Dobrze " + srednia);
        }
        else if (srednia > 5) {
            System.out.println("Bardzo dobrze" + srednia);
        }
        else if(srednia >=6) {
            System.out.println("Świetnie! " + srednia);
        }
        else {
            System.out.println("Nieprzewidziane dane błąd 404" );
        }
    }
}
