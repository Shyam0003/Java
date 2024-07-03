import java.util.*;
import java.util.Scanner;
public class first {    
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        // System.out.print("Enter the String : ");
        // String a = get.nextLine();
        // get.close();
        // System.out.println("String Is : "+a);
        String name;
        int rollno;
        int age;
        System.out.println("Enter the Information :) ");
        System.out.println("Enter the Name : ");
        name = get.nextLine();
        System.out.println("Enter the Enroll No : ");
        rollno = get.nextInt();
        System.out.println("Enter the Agee : ");
        age = get.nextInt();
        get.close();
        System.out.println("Your Information :) ");
        System.out.println("Name is  : "+name);
        System.out.println("Enrollno : "+rollno);
        System.out.println("Age is : "+age);
    }
}