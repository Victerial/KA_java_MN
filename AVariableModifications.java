package Feladatok;
import javax.lang.model.util.ElementScanner6;

public class AVariableModifications {
    public static void main(int[] args) {
        int a = 3;
        int a2=a+10;
        // increase the value of variable "a" by 10 and print the new value
        System.out.println(a2);


        int b = 100;
        int b2=b-7;
        System.out.println(b2);
        // decrease the value of b by 7 and print the new value


        int c = 44;
        int c2= c*2;
        System.out.println(c2);
        // double the value of c and print the new value


        int d = 125;
        int d2=d/5;
        System.out.println(d2);
        // divide the value of d by 5 and print the new value


        int e = 8;
        int e2= e^3;
        System.out.println(e2);
        // cube the value of e and print the new value


        int f1 = 123;
        int f2 = 345;
        if(f1>f2){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        // determine if f1 is greater than f2 (print as a boolean)


        int g1 = 350;
        int g2 = 200;
        if((g2*2)>g1)
        {
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        // determine if double the value of g2 is greater
        // than g1 (print as a boolean)


        int h = 135798745;
        if(h%11==0)
        {
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        // determine if h has 11 as a divisor (print as a boolean)


        int i1 = 10;
        int i2 = 3;
        if((i2^2)<i1 && i1<(i2^3)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        // determine if i1 is greater than i2 squared and smaller than i2 cubed
        // (print as a boolean)


        int j = 1521;
        if(j%5==0 || j%3==0)
        {
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        // determine if j is divisible by 3 or 5 (print as a boolean)


    }
}
