import java.util.Scanner;
public class Circle {
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Radius");
        double r=sc.nextDouble();
        sc.close();
        double area=3.14*r*r;
        double perimeter=2*3.14*r;
        System.out.println("Area is:"+area);
        System.out.println("Perimeter is:"+perimeter);
     }
}
