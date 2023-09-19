import java.util.Scanner;
public class DrawDiagonal {
    

    public static void main(final String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the main diagonal: ");
        int size = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j || i + j == size - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
