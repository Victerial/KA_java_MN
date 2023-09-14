package Feladatok;
import java.util.Scanner;

public class bmi {
    public static void main(final String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Please enter your hight in meter: ");
        double height = scan.nextDouble();
        System.out.print("Please enter your weight in kilograms: ");
        double weight = scan.nextDouble();
        scan.close();

        double bmi=weight/(height*height);

        System.out.print("Your BMI number is: "+bmi);

    }
}
