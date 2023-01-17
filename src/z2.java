import java.util.Scanner;
public class z2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Wpisz 'T' 't' lub 'N' 'n':");
            String input = scan.nextLine();
            if (input.equalsIgnoreCase("T") || input.equalsIgnoreCase("N")) {
                System.out.println("Dane wejściowe poprawne");
                break;
            } else {
                System.out.println("Niepoprawne dane wejściowe, spróbuj ponownie");


            }
        }
    }
}


