import java.util.Scanner;

public class Palindrome {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt(), rev = 0, temp = n;
        sc.close();

        while (temp>0) {
            rev=rev*10+temp%10;
            temp/=10;
        }
        if (n==rev) {
            System.out.println("Is palindrome");
        }else{
            System.out.println("It is not palindrome");
        }
    }
}
