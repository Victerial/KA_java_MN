import java.util.Scanner;
public class CountFromTo {
    public static void main(final String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int a= scan.nextInt();
        System.out.println("Please enter a new number: ");
        int b = scan.nextInt();
        while(b<a){
            System.out.println("Please enter a bigger number.");
            b=scan.nextInt();
        }
        scan.close();

        while(a<=b)
        {
            System.out.println(a);
            a++;
        }
    }
}
