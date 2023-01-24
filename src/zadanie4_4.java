import java.util.Scanner;
public class zadanie4_4 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int days;
            int salary = 1;
            int total = 0;




            do {
                System.out.print("Podaj liczbę przepracowanych dni: ");
                while (!scanner.hasNextInt()) {
                    System.out.print("To nie jest liczba całkowita. Podaj liczbę dni: ");
                    scanner.next();
                }
                days = scanner.nextInt();
            } while (days < 1);





            System.out.println("Dzień\tWynagrodzenie");
            System.out.println("------------------------");
            for (int i = 1; i <= days; i++) {
                System.out.println(i + "\t\t" + salary/100.0 + " zł");
                total += salary;
                salary *= 2;
            }




            System.out.println("------------------------");
            System.out.println("Suma\t\t" + total/100.0 + " zł");
        }
    }

