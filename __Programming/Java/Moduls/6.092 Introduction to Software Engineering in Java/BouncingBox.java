import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class BouncingBox {
    int x;
    int y;
    Color color;
    int xDirection = 0;
    int yDirection = 0;
    
    final int SIZE = 20;

    /**
     * Initialize a new box with its center located at (startX, startY), filled
     * with startColor.
     */
    public BouncingBox(int startX, int startY, Color startColor) {
        x = startX;
        y = startY;
        color = startColor;
    }

    /** Draws the box at its current position on to surface. */
    public void draw(Graphics2D surface) {
        // Draw the object
        surface.setColor(color);
        surface.fillRect(x - SIZE/2, y - SIZE/2, SIZE, SIZE);
        surface.setColor(Color.BLACK);
        surface.setStroke(new BasicStroke(3.0f));
        surface.drawRect(x - SIZE/2, y - SIZE/2, SIZE, SIZE);
        
        // Move the center of the object each time we draw it
        x += xDirection;
        y += yDirection;

        // If we have hit the edge, reverse direction
        if (x - SIZE/2 <= 0 || x + SIZE/2 >= SimpleDraw.WIDTH) {
            xDirection = -xDirection;
        }
        if (y - SIZE/2 <= 0 || y + SIZE/2 >= SimpleDraw.HEIGHT) {
            yDirection = -yDirection;
        }
    }

    public void moveInDirection(int xIncrement, int yIncrement) {
        xDirection = xIncrement;
        yDirection = yIncrement;
    }
}
