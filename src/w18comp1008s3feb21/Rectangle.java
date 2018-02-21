package w18comp1008s3feb21;

/**
 *
 * @author JWright
 */
public class Rectangle extends TwoDimensionalShape
{
    private double height, width;

    public Rectangle(double height, double width)
    {
        setHeight(height);
        setWidth(width);
    }

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double height)
    {
        if (height > 0)
            this.height = height;
        else
            throw new IllegalArgumentException("Height must > 0");
    }

    public double getWidth()
    {
        return width;
    }

    public void setWidth(double width)
    {
        if (width > 0)
            this.width = width;
        else throw new IllegalArgumentException("Width must be > 0");
    }

    @Override
    public double getArea()
    {
        return height * width;
    }
    
}
