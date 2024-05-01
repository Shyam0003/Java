public class EvenNumbers implements Runnable{
    public void run(){
        for(int i=2;i<=50;i+=2)
            System.out.println("EvenNumber "+i);        
    }
}
public class OddNumbers implements Runnable{
    public void run(){
        for(int i=1;i<=50;i+=2)
            System.out.println("OddNumber "+i);        
    }
}
