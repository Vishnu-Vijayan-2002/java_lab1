// eligibility heck
import java.util.Scanner;

public class Mark {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // take input from the user.
        System.out.println("Enter Your Maths mark:");
        double maths=sc.nextDouble();
        System.out.println("Enter Your Physics mark:");
        double physics=sc.nextDouble();
        System.out.println("Enter Your Chemistry mark:");
        double chemistry=sc.nextDouble();
        //object to prevent memory
        sc.close();
        int pass_mark=50;
        //Checks if the total of maths + physics + chemistry is greater than or equal to 50.
        if(maths+physics+chemistry>=pass_mark){
           System.out.println("Your  eligible for higherstudies");
           //Checks if maths + physics is at least 50.
        }else if (maths+physics>=pass_mark) {
            System.out.println("Your  eligible for higherstudies");
        } else {
            System.out.println("Your not eligible for higherstudies");

        }
        
    }
}
