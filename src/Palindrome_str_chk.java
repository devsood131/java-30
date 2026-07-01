import java.util.*;
public class Palindrome_str_chk {
    public static void main (String[]args){
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        String rev ="";
        String org= str;
        int len =str.length();
        for(int i=len-1;i>=0;i--){
            rev= rev + str.charAt(i);
        }
         if(org.equals(rev)){
             System.out.println("true");
         }
         else{
             System.out.println("false");
         }
    }
}
