package Feladatok;
import java.util.Scanner;

public class AverageOfInput {
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int a= scan.nextInt();
        System.out.println("Please enter a number: ");
		int b= scan.nextInt();
        System.out.println("Please enter a number: ");
		int c= scan.nextInt();
        System.out.println("Please enter a number: ");
		int d= scan.nextInt();
        System.out.println("Please enter a number: ");
		int e= scan.nextInt();
		scan.close();

        int sum=a+b+c+d+e;
        double avg=(a+b+c+d+e)/5;

        System.out.println("Sum: "+ sum +", Average: "+avg);
    }
}
