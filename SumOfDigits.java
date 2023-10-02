import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Adjon meg egy nem negatív egész számot: ");
        int number = scan.nextInt();

        if (number < 0) {
            System.out.println("A szám nem lehet negatív.");
        } else {
            int sum = sumOfDigits(number);
            System.out.println("A számjegyek összege: " + sum);
        }

        scan.close();
    }

    public static int sumOfDigits(int n) {
        if (n < 10) {
            return n;
        } else {
            return n % 10 + sumOfDigits(n / 10);
        }
    }
}