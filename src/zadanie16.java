import java.util.Scanner;

public class zadanie16 {
        public static void main (String[]args){

        Scanner key = new Scanner(System.in);

        System.out.println("Podaj nazwe ulubionego miasta: ");
        String m = key.nextLine();
        int d = m.length();
        char a = m.charAt(0);
        String male = m.toLowerCase();
        String duze = m.toUpperCase();


        System.out.println("Liczba znaków to: " + d + "\nMIASTO " + duze + "\nmiasto " + male + "\npierwszy znak to: " + a);
    }

}





