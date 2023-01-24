import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class zadanie3_4 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double speed;
            int time;
            double distance;




            do {
                System.out.print("Podaj prędkość pojazdu w km/h: ");
                while (!scanner.hasNextDouble()) {
                    System.out.print("To nie jest liczba zmiennoprzecinkowa. Podaj prędkość: ");
                    scanner.next();
                }
                speed = scanner.nextDouble();
            } while (speed <= 0);

            do {
                System.out.print("Podaj liczbę godzin: ");
                while (!scanner.hasNextInt()) {
                    System.out.print("To nie jest liczba całkowita. Podaj liczbę godzin: ");
                    scanner.next();
                }
                time = scanner.nextInt();
            } while (time < 1);




            File file = new File("odleglosc.txt");
            try {
                FileWriter writer = new FileWriter(file);




                writer.write("Godzina\tPrzebyta odległość\n");
                writer.write("-----------------------------\n");
                for (int i = 1; i <= time; i++) {
                    distance = speed * i;
                    writer.write(i + "\t\t" + distance + " km\n");
                }

                writer.close();
                System.out.println("Dane zostały zapisane do pliku odleglosc.txt");
            } catch (IOException e) {
                System.out.println("Wystąpił błąd podczas zapisu do pliku: " + e.getMessage());
            }
        }
    }

