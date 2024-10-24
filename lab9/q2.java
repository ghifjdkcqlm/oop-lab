import java.util.*;
public class q1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
String name = sc.nextLine(); 
//String result; 
//String copy = name;  




StringBuilder copy = new StringBuilder(name); 



for(int i =0 ; i<name.length(); i++){

    for(int j = 0 ; j<name.length(); j++){
        
        if(i!=j && name.charAt(i) == name.charAt(j)){




            copy.setCharAt(i,'*');  




        }

        // else{
        //     // String s1 = name.charAt(i);
        //     // copy.concat(name.charAt(i));
        //     copy.insert(i,name.charAt(i)); 
        // }

    }




}       String result = copy.toString();




System.out.println(result);

    }
    
}
