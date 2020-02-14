import java.time.LocalDate;
import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {
        zad5();

    }

    private static void zad5() {
        Scanner sc = new Scanner(System.in);
        float cena, raty;
        do {
            System.out.println("podaj mi piewsza liczbe");
            cena = sc.nextInt();

            System.out.println("podaj liczbe rat");
            raty = sc.nextInt();
        } while ((cena < 100 || cena > 10000) || (raty < 6 || raty > 48));


        float oprocentowanie;

        if (raty >= 6 && raty <= 12) {
            oprocentowanie = 0.025f;
        } else if (raty <= 13 && raty <= 24) {
            oprocentowanie = 0.05f;
        } else {
            oprocentowanie = 0.1f;
        }
        float odestki = cena * oprocentowanie;
        float rata = (cena / raty) + (odestki / raty);
        System.out.println(" wysokosc raty  = " + rata);
    }
}
    public static void zad12() {

        int szukanaLiczba = 50;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("podaj  liczbe calkowita dodatnia od 1do 100 ");
             int liczba = sc.nextInt();

            if (liczba> szukanaLiczba){
                System.out.println(" za duzo, podaj mniejsza");
            } else if (liczba < szukanaLiczba) {
                System.out.println("podales za mala wartosc, szukaj dalej");
            } else {
                System.out.println(" barawo wygrywasz!");
            }
        } while (szukanaLiczba == 50 );

    }









