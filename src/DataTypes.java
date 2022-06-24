// import scanner imports the Scanner class so that we can get information from the user.
import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
// Declares variables to store user input.
         int weeks, days, hours, minutes, seconds;
// Prints
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
