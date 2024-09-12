import java.util.*;
abstract class area {
    abstract double compute();

}
class rectangle extends area {
    int len;
    int bre;
    rectangle(int l, int b){
        len = l; bre = b;
    }
    double compute(){
        return len*bre;
    }

}
class circle { 
    final float pi = 3.14f;
    int rad; 
    circle(int r){
        rad = r;
    }
    double compute (){
        return pi*rad*rad;
    }
}
public class q2{
    public static void main(String[] args) {
        rectangle re = new rectangle (3,4);
        circle c = new circle(3);
        System.out.println("area of rectangle is "+re.compute());
        System.out.println("area of circle "+c.compute());
    }
}
