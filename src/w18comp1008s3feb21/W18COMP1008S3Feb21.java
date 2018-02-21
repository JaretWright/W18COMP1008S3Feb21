package w18comp1008s3feb21;

import java.util.ArrayList;

/**
 *
 * @author JWright
 */
public class W18COMP1008S3Feb21
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Circle circle1 = new Circle(5);
        Rectangle rectangle1 = new Rectangle(10,20);
        
        ArrayList<TwoDimensionalShape> shapeCollection = new ArrayList<>();
        shapeCollection.add(circle1);
        shapeCollection.add(rectangle1);
        
        for (TwoDimensionalShape shape:shapeCollection)  
            System.out.printf("%s area: %.2f%n",shape.getClass(),
                                                shape.getArea());
    }
    
}
