import java.util.*; 
class a implements Runnable { 
    public void run(){
        for(int i =0 ; i<5; i++){
            System.out.println("hello, runnable");
            try{
                Thread.sleep(1000); 
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }

    }

}
class b extends Thread{
    public void show(){
        for(int i =0 ; i<5; i++){
            System.out.println("hi, thread");
            try{
                Thread.sleep(1000); 
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
        
    }

}

public class labq1 {
    public static void main(String[] args) {
        System.out.println("how do you want to make the thread\n1- runnable interface \n2- via threads superclass\n3-both alternate");
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        switch(n){
            case 1 : 
            a objb = new a(); 
            Thread t1 = new Thread(objb); 
            t1.start();
            break; 
            case 2 : 
            b obja = new b(); 
            
            obja.show(); 
            break;
            case 3 : 
            a objaa = new a();
            b objbb = new b(); 
            
            Thread t3 = new Thread(objaa);
            t3.start(); 
            try{
                Thread.sleep(500);
                
            }catch(InterruptedException e){
                System.out.println(e);
            }
            objbb.show(); 
            try{
                t3.join();
                objbb.join(); 
            }catch(InterruptedException e){
                System.out.println(e);
            }
        
            System.out.println("both done! bye!");





        }
        
    }
    
}
