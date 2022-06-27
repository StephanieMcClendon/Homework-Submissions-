import java.util.Scanner;

public class Problem4_Homework_6_17_22 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println(" Please enter an integer:  ");

        int n = input.nextInt();
        int sum = 0;
        int num = n;

       while ( n > 0) // while loop is changing the value of n to zero producing o in the print out.
           // fix = create a new int before the while loop to stabilize the value of n
        {
            sum += ( n% 10);
            n /= 10; // reassigning the value of n
        }
        System.out.println( "The sum of all digits of " + num + " is: " + sum );
    }
}
