import java.util.*;
public class q3 {
    public static void main(String[] args){
        System.out.println("enter input string");
        Scanner sc = new Scanner(System.in); 
        String s1 = sc.nextLine(); 
        System.out.println("make a choice\na-palindrome check\nb-alphabetical order check\nc-string reversal\nd-concat the original and the reverse string");
        char t = sc.next().charAt(0); 
        boolean pal = false;
        switch (t) {
            case 'a':
            for(int i = 0; i<s1.length()/2;i++){
                if(s1.charAt(i)==s1.charAt(s1.length()-1-i)){
                    pal = true;
                }
                else{
                    pal = false; 
                }

            }
            if(pal){
                System.out.println("string is palindrome");
            }
            else{
                System.out.println("string not a plaindrome");
            }
                
                break;
                case 'b' : 
                boolean isalpha = true; 
                for(int i = 0 ; i<s1.length()-1; i++){
                    if(s1.charAt(i)>s1.charAt(i+1)){
                        isalpha = false; 
                    }
                    else{
                        isalpha = true; 
                    }

                }
                if(isalpha){
                    System.out.println("string is arranged in alphabetical order");
                }
                else { 
                    System.out.println("string is NOT arranged in alphabetical order");
                }
                break;
                case 'c' : 
                StringBuilder temp = new StringBuilder();
                for(int i=0; i<s1.length();i++){
                //String temp; 
                
                temp.append(s1.charAt(s1.length()-1-i));


//you cannot change the original string by swapping elements between them remeber strings are suppposed to be immmutable in java? 

                }
                System.out.println("reversed strings is "+temp);
                break;
                case 'd':
                StringBuilder tempp = new StringBuilder();
                for(int i=0; i<s1.length();i++){
                //String temp; 
                
                tempp.append(s1.charAt(s1.length()-1-i));


//you cannot change the original string by swapping elements between them remeber strings are suppposed to be immmutable in java? 

                }
                System.out.println("concatenated string is : "+s1+" "+tempp);


        
            default:
                break;
        }
    }
    
}
