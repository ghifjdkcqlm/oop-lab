import java.util.*; 


public class labq3 {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
for(int i =0 ; i<5; i++){
    System.out.println("hello");
    try{
        Thread.sleep(1000);
    }catch(InterruptedException e){
        System.out.println(e);
    }

}
        },"thread for hello");

        Thread t2 = new Thread(()->{
            for(int i =0 ; i<5; i++){
                System.out.println("hi");
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    System.out.println(e);
                }
    }

},"thread for hi");

t1.start(); 
try{
    Thread.sleep(500);
}catch(InterruptedException e){
    System.out.println(e);
}

try{
    t2.start(); 
t1.join(); 
t2.join();
}catch(InterruptedException e){
    System.out.println(e);
}

 System.out.println(t2.isAlive());
 
Thread t3 = new Thread(()->{
System.out.println("bye bye!");
});

t3.start();

        
    
    
}}
