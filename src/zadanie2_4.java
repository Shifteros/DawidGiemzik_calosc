import java.util.Scanner;
public class zadanie2_4 {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            double speed;
            int time;
            double distance;



            do {
                System.out.print("Podaj prędkość pojazdu w km/h: ");
                while (!scanner.hasNextDouble()) {
                    System.out.print("Spróbuj ponownie: ");
                    scanner.next();
                }
                speed = scanner.nextDouble();
            } while (speed <= 0);

            do {
                System.out.print("Podaj liczbę godzin: ");
                while (!scanner.hasNextInt()) {
                    System.out.print("Spróbuj ponownie: ");
                    scanner.next();
                }
                time = scanner.nextInt();
            } while (time < 1);




            System.out.println("Godzina\tPrzebyta odległość");
            System.out.println("-----------------------------");
            for (int i = 1; i <= time; i++) {
                distance = speed * i;
                System.out.println(i + "\t\t" + distance + " km");
            }
        }
    }


