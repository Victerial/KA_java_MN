import java.util.Scanner;
public class DrawDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many lines? ");
        int lines = sc.nextInt();

        
        for (int i = 0; i < lines / 2; i++) {
            for (int j = 0; j < (lines - 1) - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for (int i = lines % 2 == 0 ? lines / 2 - 1 : lines / 2; i >= 0; i--)  {
            for (int j = 0; j < (lines - 1) - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
