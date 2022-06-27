public class Problem3_Homework_6_17_22 {
    public static void main(String[] args)
    {
        int i, j, k, a, b, count, temp;
        count = 3;
        b = 7;
        while(b < 30)
        {
            count = count + 2;
            System.out.println(3 * count + b);
            count++;
            b = b*2;
        }
        System.out.println("count = " + count + ", b = " + b);
        a = 5;
        k = 3;
        while(k < 3)
        {
            a = k + a;
            k++;
            System.out.println(a);
            System.out.println(k);
        }
        i = 10;
        j = 0;
        temp = 3;
        while(i > 0 && j <= i)
        {
            i = i - 3;
            j++;
            System.out.println("i = " + i);
            System.out.println("j = " + j);
            j++;
        }
        System.out.println(temp + 14 % temp * 9);
    }

}
