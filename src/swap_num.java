public class swap_num {
    public static void main(String[] args) {
        int a =10;
        int b=20;

    //logic 1: Third variable
/*        int t=a;
        a=b;
        b=t;
        System.out.println("after swapping the values"+a+" "+b);      */

        // logic 2 : use + & - without using third variable
 /*     a= a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swapping the values"+a+" "+b);     */

        //logic 3: use * & / without using third variable
/*      a= a*b;
        b=a/b;
        a=a/b;
        System.out.println("after swapping the values"+a+" "+b);      */

        //logic 4: using bitwise XOR(^)
/*      a=a^b; //10^20=30
        b=a^b; // 30^20=10
        a=a^b; // 30^10=20
        System.out.println("after swapping the values"+a+" "+b);       */

        //logic 5: single statement
        b=(a+b)-(a=b);
        System.out.println("after swapping the values"+a+" "+b);
    }
}