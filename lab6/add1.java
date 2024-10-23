import java.util.*; 
class game { 
public void type(){ 
    System.out.println("indoor and outdoor games");

}
}
class cricket extends game{
    public void type(){
        System.out.println("cricket is an outdoor game");
    }
}
class chess extends game{ 
    public void type(){
        System.out.println("chess is an indoor game");
    }
}
public class add1{
    public static void main(String[] args) {
        //chess cf = new chess(); 
        cricket ck = new cricket(); 
        chess k = new chess(); 
        k.type(); 
        ck.type(); 
    }
}
