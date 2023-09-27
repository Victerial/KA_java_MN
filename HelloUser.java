import java.util.Scanner;
public class HelloUser {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.printf("Please enter your name: ");
        String name = scan.next();
        System.out.printf("Hello "+name);
        scan.close();
    }
}
