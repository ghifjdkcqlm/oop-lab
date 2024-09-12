import java.util.*;
abstract class banks{
    abstract int roi();
}
class sbi extends banks{
    int roi; 
    int roi(){
        return 8;
    }
}
class axis extends banks{
    int roi; 
    int roi(){
        return 9;
    }
}
class icici extends banks{
    int roi; 
    int roi(){
        return 7;
    }
}
public class q3{
    public static void main(String[] args) {
        sbi s = new sbi(); 
        axis a = new axis(); 
        icici i = new icici(); 
        System.out.println("SBI ROI --> "+s.roi()+"%");
        System.out.println("AXIS ROI --> "+a.roi()+"%");
        System.out.println("ICICI ROI --> "+i.roi()+"%");

    }
}
