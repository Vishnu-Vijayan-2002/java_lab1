// salary bonus finding
import java.util.Scanner;

public class Salarybonus {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr Your Employee Type:");
        // read the lines as a string and removes extra spaces
        String type=sc.nextLine().trim().toLowerCase();
        // Initialize salary
        double salary=0;
        //  salary based on employee type
        switch (type) {
            case "manager":
                salary=50000;
                break;
            case "developer":
                salary=30000;
                break;
            case "intern":
                salary=15000;
                break;        
            default:
                System.out.println("Invalid type");
                return;
        }
         // Get experience input
        System.out.println("Enetr Your Experience :");
        double experience=sc.nextDouble();
        sc.close();
       double bonus=0;
    //    Corrected experience condition
      if (experience<=3&& experience<=5) {
          bonus=salary*0.10;
      } else if(experience>5){
          bonus=salary*0.20;
      }
      double totalsalary=salary+bonus;
      System.out.println("Base salary"+salary);
      System.out.println("Bonus"+bonus);
      System.out.println("Total salary"+totalsalary);

    }
}
