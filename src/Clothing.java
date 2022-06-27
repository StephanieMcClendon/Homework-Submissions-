public class Clothing {
    public double price;
    public String type;
    public String size;

    //A default “no-arg”
    // constructor that sets the price to 29.9, the type to “TShirt” and the size to “Medium
    public Clothing()
    {
        price= 29.9;
        type = "T-shirt";
        size = "Medium";
    }
    //An overloaded constructor that takes three parameters and set the
    //instance variables accordingly.
    public Clothing(double cost, String t, String measurement)
    {
        price = cost;
        type = t;
        size = measurement;
    }
    //A method named increasePrice that takes no parameters and returns
    //no value, the method increases the instance variable price by 5.
    public void increasePrice()
    {
        price = price + 5;
    }
    //An overloaded method increasePrice that takes a double parameter x
    //and returns no value, the method increases the instance variable price by
    //the value of parameter x.
    public void increasePrice(double x)
    {
        price = price + x;
    }
    //A method named details which takes no parameters, returns no value,
    //the method prints the Clothing item details in the format shown in the
    //sample output.
    public void details()// had to remove static **
    {
        System.out.println(" Item: " + type);
        System.out.println(" Size: " + size);
        System.out.println(" Price: $" + price);
        System.out.println(    );
    }
}
