import java.util.*;
class student{
    String name; 
    int id; 
    String college;
    public void display(){
        System.out.println("name --> "+this.name);
        System.out.println("ID --> "+this.id);
        System.out.println("College --> "+this.college);
    }
    public void take_info(){ 
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        this.name = sc.nextLine(); 
        System.out.println("enter ID");
        this.id = sc.nextInt();
        System.out.println("enter college");
        sc.nextLine();
        this.college = sc.nextLine();


    }
}
public class q1 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many students are there your MIT?");
        int n = sc.nextInt(); 
        student mit[] = new student[n]; 
        int count = 0;
        for(student i : mit){
            mit[count]= new student(); 
            System.out.println("enter "+(count+1)+" student's information");
            mit[count].take_info();
            count++;

        }
count = 0;
        for(student i : mit){
            //mit[count]= new student(); 
            System.out.println((count+1)+" student's information");
            mit[count].display();
            count++;

        }

        
    }
}
