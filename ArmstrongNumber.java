// find the armstrong numbers
import java.util.Scanner;

public class ArmstrongNumber {
    public static boolean isArmstrong(int num) {
        int originalNum = num, sum = 0;
        // converts the number to a string and gets its length
        int digits = String.valueOf(num).length();

        for (int temp = num; temp > 0; temp /= 10) {
            // extracts the last digit
            int digit = temp % 10;
            // Computes the power of the digit
            sum += Math.pow(digit, digits);
        }

        return sum == originalNum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        scanner.close();
    }
}

