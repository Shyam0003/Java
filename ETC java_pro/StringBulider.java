// import java.util.*;
// import java.util.concurrent.LinkedBlockingQueue;
public class StringBulider {    
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        str.append("Shyam");
        System.out.println("This is Str : "+str.toString());
        
        StringBuilder str1 = new StringBuilder("Hello World");
        System.out.println("This is String 1 : "+str1.toString());
        
        // StringBuilder str2 = new StringBuilder(10);
        // System.out.println("This is String 2 = "+str2.tocapacity());
        
        StringBuilder str3 = new StringBuilder("Hii ");
        System.out.println("This is String 3 : "+str3.toString());
        // Reverse String 
        // StringBuilder restr = str.reverse();
        // System.out.println("This is Reverse String : "+restr);
        char ch = str.charAt(0);
        System.out.println("Index Number : "+ch);  
    }
}
