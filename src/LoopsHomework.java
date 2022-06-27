import java.util.Scanner;

public class LoopsHomework {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt the user for a positive integer n greater than one.
        System.out.println(" Enter an integer greater than one: ");
        int num = input.nextInt();
        int count = 1;
        // int count is there to accumulate the factors of input
        int sum = 0;
        // int sum is there to store the accumulation of count

        //print out the sum of all the factors* of the integer using a while loop
        while (count <= num)
        {
            if (num % count == 0)// checking which numbers are factors of input
            {
                sum = sum + count;
                System.out.println(" factors of " +  num + " are " + count);
            }
            count++;
        }
        System.out.println(" the total of factors for " + num + " is " + sum);
    }
}
