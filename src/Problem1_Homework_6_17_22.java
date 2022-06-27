import java.util.Scanner;

public class Problem1_Homework_6_17_22 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println(" Please enter a positive integer: ");
        int x = input.nextInt();


        for (int i = 1; i <= x; i++)
        //loop will run from i which is 1 to x which is the input number increasing by 1.
        {
            if (i % 2 !=0)// checking for odd intervals in the count by making it not equal to zero
            {
                if (i % 3 ==0)//
                {
                    System.out.println( i + " is a multiple of 3. ");
                }
            }
        }
    }
}
