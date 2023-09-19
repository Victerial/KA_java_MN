import java.util.Scanner;
public class Cuboid {
    public static void main(final String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter side a: ");
        float a= scan.nextFloat();
        System.out.println("Please enter side a: ");
        float b = scan.nextFloat();
        System.out.println("Please enter side a: ");
        float c = scan.nextFloat();
        scan.close();
        float V= (a*b*c);
        float A = (2*((a*b)+(b*c)+(a*c)));

        System.out.println("Surface area: "+A);
        System.out.println("Volume: "+V);
    }
}
