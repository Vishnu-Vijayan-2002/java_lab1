import java.util.Scanner;
public class Rectangle {
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Length:");
        double l=sc.nextDouble();
        System.out.println("Enter the width:");
        double w=sc.nextDouble();
        sc.close();
        double area=l*w;
        double perimeter=2*(w+l);
        System.out.println("Area of the Rectangle:"+area);
        System.out.println("Perimeter of Rectangle:"+perimeter);
     }

}
