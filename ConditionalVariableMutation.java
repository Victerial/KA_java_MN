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
        
        System.out.println("Please enter an integer between 0 and 100.");
        int c =scan.nextInt();
        System.out.println("Please enter true or false.");
        boolean isBonus = scan.nextBoolean();

        if(c>50 && isBonus==false)
        {
            System.out.println(c-2);
        }
        else if(c<50 && isBonus==false)
        {
            System.out.println(c-1);
        }
        if(isBonus==true)
        {
            System.out.println(c);
        }

        System.out.println("Please enter  an integer between 0 and 50");
        int d =scan.nextInt();
        System.out.println("Please enter  an integer between 0 and 500");
        int time =scan.nextInt();

        if(d%4==0 && time<200){
            System.out.println("Check");
        }
        else if(time>200){
            System.out.println("Time out");
        }
        else{
            System.out.println("Run Forest Run!");
        }

        scan.close();
    }
}
