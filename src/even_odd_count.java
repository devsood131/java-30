import java.util.Scanner;

public class even_odd_count {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count_even = 0;
        int count_odd = 0;

        while (num > 0) {
            int num_1 = num % 10;
            int eve = num_1;

            if (eve % 2 == 0) {
                count_even++;
            } else {
                count_odd++;
            }

            // FIXED: This is now INSIDE the loop and updates 'num'
            num = num / 10;
        } // The while loop ends here

        // FIXED: Print statements moved here to show the final totals
        System.out.println("The even count is: " + count_even);
        System.out.println("The odd count is: " + count_odd);
    }
}