import java.util.Scanner;

public class zadanie8 {

    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);


//pokoj1
        System.out.println("Podaj długosc pokoju nr1: ");
        double dl1 = klawiatura.nextInt();
        klawiatura.nextLine();

        System.out.println("Podaj szerokosc pokoju nr1: ");
        double s1 = klawiatura.nextInt();
        klawiatura.nextLine();
//pokoj 2
        System.out.println("Podaj długosc pokoju nr2: ");
        double dl2 = klawiatura.nextInt();
        klawiatura.nextLine();

        System.out.println("Podaj szerokosc pokoju nr2: ");
        double s2 = klawiatura.nextInt();
        klawiatura.nextLine();
//pokoj3
        System.out.println("Podaj długosc pokoju nr3: ");
        double dl3 = klawiatura.nextInt();
        klawiatura.nextLine();

        System.out.println("Podaj szerokosc pokoju nr3: ");
        double s3 = klawiatura.nextInt();
        klawiatura.nextLine();
//pokoj4
        System.out.println("Podaj długosc pokoju nr4: ");
        double dl4 = klawiatura.nextInt();
        klawiatura.nextLine();

        System.out.println("Podaj szerokosc pokoju nr4: ");
        double s4 = klawiatura.nextInt();
        klawiatura.nextLine();

        int a, b, c, d, e;

        a = (int) (dl1 * s1);
        b = (int) (dl2 * s2);
        c = (int) (dl3 * s3);
        d = (int) (dl4 * s4);
        e = a + b + c + d;

        double f = (double) e / 4;


        System.out.println("Powierzchnia przypadająca na jedną osobe to: " + f + "m2");
    }
}