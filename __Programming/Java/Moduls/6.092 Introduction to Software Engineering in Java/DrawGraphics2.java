import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;

public class DrawGraphics {
    ArrayList<BouncingBox> boxes;
    
    /** Initializes this class for drawing. */
    public DrawGraphics() {
        boxes = new ArrayList<BouncingBox>();
        BouncingBox box = new BouncingBox(200, 50, Color.RED);
        box.moveInDirection (10, 5);
        boxes.add (box);
        boxes.add (new BouncingBox (100, 45, Color.YELLOW));
        boxes.get(1).moveInDirection (-3, 5);
    }

    /** Draw the contents of the window on surface. */
    public void draw(Graphics2D surface) {
        surface.drawLine(50, 50, 250, 250);
        for (BouncingBox box : boxes) {
            box.draw(surface);
        }
    }
}
