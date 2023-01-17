import java.util.Scanner;
public class Z7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;
        for (int i = 0; i < 7; i++) {
            System.out.print("Wprowadź liczbę: ");
            int number = scan.nextInt();
            sum += number;
        }
        System.out.println("Suma wprowadzonych liczb: " + sum);
    }
}
