import java.util.Scanner;
public class DrawChessTable {
    public static void main(final String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the board size: ");
        int n =scan.nextInt();
        while(n<=0)
        {
            System.out.println("Please enter a number which is bigger than 0.");
            n=scan.nextInt();
        }
        scan.close();
        for(int i =0; i < n; i++) 
        {
            for(int j = 0; j < n; j++)
            {
                if( (i+j) % 2 == 0){
                    System.out.print(" % ");
                }
                else {
                    System.out.print("");  
                }
            }
            System.out.println("");
        }
    }
}
