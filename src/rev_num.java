import java.util.*;
public class rev_num {
    public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        //1-using algortihm
       /* int rev =0;           // we initialize rev to act as a container for our rev number
        while(num!=0){
            rev=rev*10+num%10;// rev*10 -shifts the digit of our reversed number from one place to the left and create space for the next digit
                              //num%10- use the modulo operator to grab the very last digit of num
            num=num/10;       // it chops the last number from the entered number
            System.out.println("reverse number is:"+" "+rev);
        }*/
        // 2- String buffer method
        /*StringBuffer sb= new StringBuffer(String.valueOf(num));
        StringBuffer rev= sb.reverse();
        System.out.println("Reverse number is :+" "+rev);*/

        //3- String builder method
         StringBuilder sd= new StringBuilder(String.valueOf(num));
         StringBuilder rev= sd.reverse();
        System.out.println("Reverse number is:"+" "+ rev);
    }

}
