public class Rectangle extends Shape
{
    private double width;
    private double length;

    public Rectangle()
    {
        length = 2;

        width = 1;
    }

    public Rectangle(double length, double width)
    {
        SetLW(length, width);
        this.length = length;
        this.width = width;
    }

    public Rectangle(double length, double width, boolean isFilled, String color)
    {
        super(isFilled, color);
        this.length = length;
        this.width = width;
    }

    public void SetLW(double x , double y)
    {
        if(x > y)
        {
            this.length = x;
            this.width = y;
        }
        else
        {
            this.length = y;
            this.width = x;
        }
    }

    public double getArea()
    {
        return this.width * this.length;
    }

    public String toString()
    {
        return "width: " + this.width + "\n" + "Length: " + this.length+ "\n" + "Area: " + getArea()+ "\n" + "Filled: " + super.toString();
    }

}