import java.awt.*;

public class MyPoint {
    private int size;
    private Color color;
    private int x;
    private int y;

    public MyPoint(int size, Color color, int x, int y) {
        this.size = size;
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public int getSize() {
        return size;
    }

    public Color getColor() {
        return color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
