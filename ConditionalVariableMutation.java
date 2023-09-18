import java.util.Scanner;

public class ConditionalVariableMutation {
    public static void main(final String[] args)
    {
        Scanner scan=new Scanner(System.in);

        System.out.println("Please enter an integer: ");
        int a =scan.nextInt();
        

        if(a%2==0)
        {
            System.out.println(a+1);
        }

        System.out.println("Please enter an integer between 0 and 30.");
        int b=scan.nextInt();
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
        


        scan.close();
    }
}
