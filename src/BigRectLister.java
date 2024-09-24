import java.awt.*;
import java.util.ArrayList;

public class BigRectLister {
    //creates an ArrayList of 10 Rectangles making sure that you have several that are under and several that are over a perimeter of 10.
    // List the rectangles that have big perimeters.
    public static void main (String[] args) {
        ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
        rectangles.add(new Rectangle(2,1));
        rectangles.add(new Rectangle(3,2));
        rectangles.add(new Rectangle(4,2));
        rectangles.add(new Rectangle(5,2));
        rectangles.add(new Rectangle(6,2));
        rectangles.add(new Rectangle(7,2));
        rectangles.add(new Rectangle(8,2));
        rectangles.add(new Rectangle(9,2));
        rectangles.add(new Rectangle(10,2));
        rectangles.add(new Rectangle(11,2));
        BigRectangleFilter filter = new BigRectangleFilter();
        int count = 0;
        for (Rectangle r : rectangles) {
            count++;
            if (filter.accept(r)) {
                System.out.println("Rectangle " + count + " is a big rectangle. It has a perimeter of " + (r.getHeight() + r.getWidth()) * 2);
            }
        }
    }

}
