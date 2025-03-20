import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String []args){
        Scanner c=new Scanner(System.in);
        System.out.println("Enetr a limit:");
        int limit=c.nextInt();
        c.close();
        int a=0,b=1;
        System.out.println(a+"\n"+b);
        int nextnum=a+b;
        while (nextnum<=limit) {
            System.out.println(""+nextnum);
            a=b;
            b=nextnum;
            nextnum=a+b;
        }
    }
}
