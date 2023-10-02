import java.util.Scanner;

public class Fibonacci {
    int length =0;
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Adja meg a sorozat hosszát:");
        int length = scan.nextInt();

        System.out.println("A fibonacci sorozat:");
        for(int i=0; i<length;i++){
            System.out.println(fibonacci(i)+ " ");
        }
        scan.close();
    }
    public static int fibonacci(int length){
        if(length==1){
            return length;
        }else{
            return fibonacci(length-1)+fibonacci(length-2);
        }
    }
    
    
}
