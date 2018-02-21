package w18comp1008s3feb21;

/**
 *
 * @author JWright
 */
public class Circle extends TwoDimensionalShape
{
    private double radius;

    /**
     * The constructor should always fully configure
     * your object so that it is usable with all methods
     * @param radius 
     */
    public Circle(double radius)
    {
        setRadius(radius);
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        if (radius > 0)
            this.radius = radius;
        else
            throw new IllegalArgumentException("Radius"
                    + ",must be positive");
    }
    
    /**
     * This method will calculate and return the area of the circle
     */
    public double getArea()
    {
        return Math.PI*radius*radius;
    }
    
    
    
            
}
