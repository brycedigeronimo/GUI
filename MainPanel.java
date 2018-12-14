import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JPanel;

import java.util.ArrayList;

public class MainPanel extends JPanel {
    private int size;
    private Color color;
    private final ArrayList<MyPoint> points;
    private Point previousPoint;

    public MainPanel() {

        points = new ArrayList<>();
        previousPoint = new Point(0, 0);
        size = 5; //default size
        color = Color.BLACK;



        addMouseMotionListener(
                new MouseMotionAdapter() {
                    public void mouseDragged(MouseEvent event) {
                        //add each point to arrayList points
                        points.add(new MyPoint(size, color, event.getPoint().x, event.getPoint().y));
                        repaint();
                    }
                }
        );

        addMouseListener(
                new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        points.add(new MyPoint(size, color, e.getPoint().x, e.getPoint().y));
                        repaint();
                    }

                    @Override
                    public void mousePressed(MouseEvent e) {

                    }

                    @Override
                    public void mouseReleased(MouseEvent e) {

                    }

                    @Override
                    public void mouseEntered(MouseEvent e) {

                    }

                    @Override
                    public void mouseExited(MouseEvent e) {

                    }
                }
        );
    }

    public void clear(){
        points.clear();
        repaint();
    }

    public void setSize(int size){
        this.size = size;
    }

    public void setColor(Color c) {
        this.color = c;
    }


    public void paintComponent(Graphics g) {
        super.paintComponent(g);


        for(MyPoint point : points) {
            g.setColor(point.getColor());
            g.fillOval(point.getX(), point.getY(), point.getSize(), point.getSize());
        }
    }
}
