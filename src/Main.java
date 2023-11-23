import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner skaner = new Scanner(System.in);
        System.out.println("Podaj slowo");
        String str = skaner.nextLine();

        if (str.length() <= 2) {
            System.out.println("Błąd");
        } else {
            int strprzemiana = str.length() / 2;

            String str1 = str.substring(strprzemiana, strprzemiana+2);
            String str2 = str.concat(str1);
            System.out.println(str2);
        }

    }
}