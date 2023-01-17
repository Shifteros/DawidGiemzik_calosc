import java.util.Scanner;
public class z3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Wpisz 'Tak' lub 'Nie':");
            String response = input.nextLine();
            if (response.equalsIgnoreCase("Tak") || response.equalsIgnoreCase("Nie")) {
                System.out.println("Dane wejściowe poprawne");
                break;
            } else {
                System.out.println("Niepoprawne dane wejściowe, spróbuj ponownie");
            }
        }
    }
}
