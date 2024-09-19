import java.util.*;
public class q1{ 
    public static void main(String[] args) {
        System.out.println("enter string");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        System.out.println(s1);
        int chars=0,words=0,lines=0,vowels=0; 
        //counts of them
        //int len = s1.length();
        for(int i = 0 ; i<s1.length()-1; i++){
            if((s1.charAt(i)!=' ')&&(s1.charAt(i+1)==' ')){
                words++;
            }
        }
        for(int i = 0; i<s1.length(); i++){
            if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u'){
                vowels++;
            }
        }
        for(int i =0 ; i<s1.length(); i++){
            if(s1.charAt(i)=='.'){
                lines++;
            }
        }
System.out.printf("total characters in the string are : %d\n",s1.length());
System.out.printf("total words in the entered string are : %d\n",words);
System.out.printf("total vowels in the entered string are : %d\n",vowels);
System.out.printf("total lines in the entered string are : %d\n",lines);
    }
}
