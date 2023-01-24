import java.util.Scanner;
public class zadanie1_4 {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int number;
            int sum = 0;


            do {
                System.out.print("Podaj dodatnią, niezerową liczbę całkowitą: ");
                while (!scanner.hasNextInt()) {
                    System.out.print("To nie jest liczba całkowita. Podaj liczbę: ");
                    scanner.next();
                }
                number = scanner.nextInt();
            } while (number <= 0);


            for (int i = 1; i <= number; i++) {
                sum += i;
            }

            System.out.println("Suma liczb od 1 do " + number + " wynosi: " + sum);
        }
    }

