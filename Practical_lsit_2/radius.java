 import java.util.*;
public class radius {
    public static void main(String[] args) {
        double radius,area;
        final double PI=3.14;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of area : ");
        radius = sc.nextDouble();       
        area=PI*radius*radius;
        System.out.println("The raduis of circle : "+area);
    }
}
