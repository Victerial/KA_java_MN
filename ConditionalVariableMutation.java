import java.util.Scanner;

public class ConditionalVariableMutation {
    public static void main(final String[] args)
    {
        Scanner scan=new Scanner(System.in);

        System.out.println("Please enter an integer: ");
        int a =scan.nextInt();
        scan.close();

        if(a%2==0)
        {
            System.out.println(a+1);
        }

        Scanner scan2 = new Scanner(System.in);

        System.out.println("Please enter an integer between 0 and 30.");
        int b=scan2.nextInt();
        if(10<b && b<20)
        {
            System.out.println("Sweet");
        }
        else if(b<=10)
        {
            System.out.println("less");
        }
        else{
            System.out.println("More");
        }
    }
}
