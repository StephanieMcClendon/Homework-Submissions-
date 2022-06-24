import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         int weeks, days, hours, minutes, seconds;

        System.out.println(" Enter an integer for value for weeks.");
        weeks = in.nextInt();
        System.out.println(weeks + "weeks are equal to ");

        days = weeks*7;
        hours = days*24;
        minutes = hours * 60;
        seconds = minutes*60;

        System.out.println(weeks + " weeks" + "\n" + days + " days" + "\n" + hours + " hours" + "\n" + minutes + " minutes" + "\n" + seconds + " seconds");


    }
}
