import java.util.Scanner;
public class zadanie13 {
    public static void main(String[] args) {

        double a = 75;

        Scanner key = new Scanner(System.in);

        System.out.println("Podaj liczbe zjedzonych ciasteczek: ");
        double c = key.nextDouble();

        double wynik = c*a;

        System.out.println("Zjadłeś: " +wynik  +"Kalorii");

    }

}
