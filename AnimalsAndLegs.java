package Feladatok;
import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(final String[] args) {
		System.out.println("Please enter the numbers of chickens: ");
		Scanner scan = new Scanner(System.in);
		int chickens= scan.nextInt();
        System.out.println("Please enter the numbers of pigs: ");
		int pigs= scan.nextInt();
		scan.close();

		int allChickenLegs=chickens*2;
		int allPigLegs=pigs*4;
		int totalLegsNumber = allChickenLegs+allPigLegs;
        

        System.out.println("The number of legs: "+totalLegsNumber);

	}
}
