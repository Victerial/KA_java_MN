import java.util.Scanner;

public class Factorial {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Adjon meg egy egész számot:");
        int number = scan.nextInt();
        while(number<0)
        {
            System.out.println("A szám nem lehet negatív, adjon meg egy új számot:");
            number = scan.nextInt();
        }

        int eredmeny = 0;
        for(int i =1; i<=number;i++)
        {
            eredmeny*=i;
        }
        System.out.println(eredmeny);

        scan.close();
    }
    
    public int Factorial(int n)
    {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorialRecursive(n - 1);
        }
    }

    
}
