// grades
import java.util.Scanner;

public class Grades {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your percentage:");
        double percentage=sc.nextDouble();
        sc.close();
        String grade = null;
        String feedback=null;

        if (percentage>=90) {
            grade="A";
            feedback="Excellent work!...";
        } else if(percentage>=80) {
            grade="B";
            feedback="Good job!..";
        }else if (percentage >=70) {
            grade="C";
            feedback="You can do better";
        }else if (percentage>=60) {
            grade="D";
            feedback="Work harder..";
        }else if(percentage<60){
            grade="F";
            feedback="Failed. Try again";
        }
        System.out.println("Your Grade is:"+grade);
        System.out.println("FeedBack :"+feedback);
    } 
}
