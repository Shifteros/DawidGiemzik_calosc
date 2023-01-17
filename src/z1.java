import java.util.Scanner;
public class z1 {
    public static void main(String[] args){
        Scanner klaw = new Scanner(System.in);

        System.out.println("Podaj liczbe z zakresu 10-24");
        int a  = klaw.nextInt();

        while (a<10 || a>24) {
            System.out.println("miala byc liczba z zakresu 10-24");
            a = klaw.nextInt();
        }
        System.out.println(a);



    }
}
