import java.util.Scanner;
public class zadanie21 {
    public static void main(String[] args) {

        Scanner klawiatura=new Scanner(System.in);

        System.out.println ("Kwota pierwotna na koncie: ") ;
        double P = klawiatura.nextDouble();

        System.out.println ("Roczna stopa oprocentowania: ") ;
        double r = klawiatura.nextDouble()/100;

        System.out.println ("liczbe odsetek: ") ;
        double n = klawiatura.nextDouble();

        System.out.println ("Liczbe lat: ") ;
        double t = klawiatura.nextDouble();
        klawiatura.close();

        double A = (1 +r/n);
        double B = (n*t);
        double C = Math.pow(A, B);
        double D = P * C;


        System.out.println ("Kwota pieniedzy na koncie to: " +D );
    }

}
