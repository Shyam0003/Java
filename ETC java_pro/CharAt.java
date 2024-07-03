public class CharAt {
    public static void main(String[] args) {
        // StringBuilder str = new StringBuilder("Hello World");
        // System.out.println("String is : " + str.toString());
        // for (int i = 0; i < str.length(); i++) {
        //     char ch = str.charAt(i);
        //     System.out.println(" Position : " + i + " " + ch);
        // }
        try{
            StringBuilder str = new StringBuilder("Hello World");
            System.out.println("String is : "+str);

            char ch = str.charAt(str.length());
            System.out.println("Position : "+str.length()+"Char is : "+ch);
        }
        catch(Exception e){
            System.out.println("Exception : "+e);

        }

    }
}
