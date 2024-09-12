import java.util.*;

class base { 
    String name; 
    int age; 
    int regnum;
}
class ug extends base { 
    int sem; 
    int fees; 
    public void admit(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        this.name = sc.nextLine(); 
        System.out.println("enter age");
        this.age = sc.nextInt(); 
        System.out.println("enter registration number");
        this.regnum = sc.nextInt(); 
        System.out.println("enter semester");
        this.sem = sc.nextInt(); 
        System.out.println("enter fees");
        this.fees = sc.nextInt();
    }
    public void display(){ 
        System.out.printf("name - %s\n",this.name);
        System.out.printf("age - %d\n",this.age);
        System.out.printf("registration number - %d\n",this.regnum);
        System.out.printf("semester - %d\n",this.sem);
        System.out.printf("fees - %d\n",this.fees);
    }

}
class pg extends base { 
    int sem; 
    int fees;
    public void admit(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        this.name = sc.nextLine(); 
        System.out.println("enter age");
        this.age = sc.nextInt(); 
        System.out.println("enter registration number");
        this.regnum = sc.nextInt(); 
        System.out.println("enter semester");
        this.sem = sc.nextInt(); 
        System.out.println("enter fees");
        this.fees = sc.nextInt();
    }
    public void display(){ 
        System.out.printf("name - %s\n",this.name);
        System.out.printf("age - %d\n",this.age);
        System.out.printf("registration number - %d\n",this.regnum);
        System.out.printf("semester - %d\n",this.sem);
        System.out.printf("fees - %d\n",this.fees);
    }
}
public class q2 {
 public static void main(String[] args) {
    int k,count =0, countt =0; 

    //do{
       // System.out.println("enter 0 to stop enrollment");
        Scanner sc = new Scanner(System.in);
       // k = sc.nextInt();
    //System.out.println("choose u-->undergrads and p-->postgrads");
    //char t = sc.next().charAt(0);
    //switch (t){
        //case 'u': 
        System.out.println("how many undergrads to enroll?");
        int n = sc.nextInt(); 
        ug obj[] = new ug[n];
        //int count = 0;
        for(ug i: obj){
            System.out.printf("enter %d student's info\n",count+1);
            obj[count]= new ug();
            obj[count].admit(); 
            count++;
        }
        //break;
       // case 'p': 
        System.out.println("how many postgrads to enroll?");
        int m = sc.nextInt(); 
        pg obj1[] = new pg[m];
        //int countt = 0;
        for(pg i: obj1){
            System.out.printf("enter %d student's info\n",countt+1);
            obj1[countt]= new pg();
            obj1[countt].admit(); 
            countt++;
        }
        //break;
        //default : 
        //System.out.println("incorrect option!");
    //}

 //}while(k!=0);
 System.out.printf("total ug students enrolled = %d and total pg students enrolled = %d\n",count,countt);

 //for displaying 
 System.out.println("UNDERGRAD STUDENTS INFORMATION");
 for(int i = 0; i<count;i++){
    System.out.printf("details of %d student\n",i+1);
    obj[i].display();
 }

 System.out.println("POSTGRAD STUDENTS INFORMATION");
 for(int i = 0; i<countt;i++){
    System.out.printf("details of %d student\n",i+1);
    obj1[i].display();
 }
}
    
}




