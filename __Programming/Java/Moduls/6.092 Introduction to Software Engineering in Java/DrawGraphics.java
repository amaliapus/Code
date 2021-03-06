import java.awt.Color;
import java.awt.Graphics2D;

public class DrawGraphics {
    BouncingBox box;
    
    /** Initializes this class for drawing. */
    public DrawGraphics() {
        box = new BouncingBox(200, 50, Color.RED);
    }

    /** Draw the contents of the window on surface. */
    public void draw(Graphics2D surface) {
        surface.drawLine(50, 50, 250, 250);
        box.draw(surface);
    }
}
