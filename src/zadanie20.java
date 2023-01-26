import java.util.Scanner;
public class zadanie20 {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);

        System.out.println ("Prosze podac liczbe oczekiwanych ciasteczek ") ;
        double ilosc = klawiatura.nextDouble();
        klawiatura.nextLine();

        double cukru=1.5/48*ilosc;
        double masla=1.0/48*ilosc;
        double maki=2.75/48*ilosc;

        // System.out.println("Potrzebujesz "+cukru+"g cukru");
        // System.out.println("Potrzebujesz "+masla+"g masla");
        //  System.out.println("Potrzebujesz "+maki+"g maki");


        System.out.print("Potrzebujesz ");
        System.out.printf("%.2f", cukru);
        System.out.println("g cukru");

        System.out.print("Potrzebujesz ");
        System.out.printf("%.2f", masla);
        System.out.println("g masla");

        System.out.print("Potrzebujesz ");
        System.out.printf("%.2f", maki);
        System.out.println("g maki");

    }
}
