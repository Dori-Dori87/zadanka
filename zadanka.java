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









