import java.util.*; 
public class labq4 {
    public static void main(String[] args) {

        Thread t1 = new Thread(()->{
System.out.println("hello");
        });
        t1.setPriority(3);
        Thread t2 = new Thread(()->{

            System.out.println("hi");

        });
        t2.setPriority(4);
        try{
            t1.start(); 
            t1.join(); 
            t2.start(); 
            t2.join(); 
        }catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
    }
    
}
