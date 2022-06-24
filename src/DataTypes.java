import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
// Scanner to intake user input and integers assigned by broken down time phases.
        Scanner in = new Scanner(System.in);
         int weeks, days, hours, minutes, seconds;
// System requesting user input.
        System.out.println(" Enter an integer for value for weeks.");
        weeks = in.nextInt();
        System.out.println(weeks + "weeks are equal to ");
// values for days hours weeks minutes and seconds defined by simple multiplication.
        days = weeks*7;
        hours = days*24;
        minutes = hours * 60;
        seconds = minutes*60;
// system displaying the conversion for inputted amount of weeks.
        System.out.println(weeks + " weeks" + "\n" + days + " days" + "\n" + hours + " hours" + "\n" + minutes + " minutes" + "\n" + seconds + " seconds");


    }
}
