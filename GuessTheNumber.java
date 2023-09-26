
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rn = new Random();
        int answer = rn.nextInt(10);
        System.out.println("Try to guess the number: ");
        int tipp = scan.nextInt();
        while(tipp!=answer){
            if(tipp<answer)
            {
                System.out.println("greater");
                tipp=scan.nextInt();
            }
            else{
                System.out.println("smaller");
                tipp=scan.nextInt();
            }
            
        }
        scan.close();
    }
}
