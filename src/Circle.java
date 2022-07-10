public class Circle extends Shape
{
    private double radius;

    public Circle()
    {
        radius = 1;
    }

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public Circle(double radius, boolean isFilled, String color)
    {
        super(isFilled,color); // use this syntax to call from the parent class;
        this.radius = radius;
    }

    public double getArea()
    {
        return  Math.PI * Math.pow(radius,2);
    }

    public String toString()
    {
        return "Radius: " + this.radius + "\n" + "Area: " + getArea()+ "\n" + "Filled: " + super.toString();
    }
}
