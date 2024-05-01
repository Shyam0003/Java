package com.example1;

class PrintNumberDividedbythree implements runnable{
    public void run(){
        for(int i=0;i<=50;i++)
        {
            if(i%3==0)
            {
                System.out.println("Thread - 1 : ) "+i);
            }
        }
    }
}
/**
 *  Print
 */
public class  PrintNumberDividedbyfive  implements runnable{
    public void run(){
        for(int i=0;i<=50;i++)
        {
            if(i%5==0)
            {
                System.out.println("Thread - 2 : ) "+i);
            }
        }
    }
}

public class P4 {
    public static void main(String[] args) {
        
    }    
}
