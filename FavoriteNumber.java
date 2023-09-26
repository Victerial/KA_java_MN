import java.util.Scanner;

public class FavoriteNumber{
    public static void main(final String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please neter a number: ");;
        int a = scan.nextInt();
        scan.close();
        System.out.println("My favorite number is: "+a);
        
    }
}