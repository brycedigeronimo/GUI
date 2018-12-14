import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import javax.swing.*;

public class MainFrame extends JFrame {
    private final JButton button1;
    private final JButton button2;
    private final JButton button3;
    private final JButton button4;
    private final JButton small;
    private final JButton medium;
    private final JButton large;
    private final JButton clear;
    private MainPanel mainPanel;

    public MainFrame() {
        setLayout(new BorderLayout());

        mainPanel = new MainPanel();
        add(mainPanel, BorderLayout.CENTER);

        /*Using GridLayout with 0 rows and 1 column to stack buttons vertically on the left and
        right side of the panel
        */
        JPanel leftButtons = new JPanel(new GridLayout(0, 1));
        JPanel rightButtons = new JPanel(new GridLayout(0, 1));

        //Create buttons and link to corresponding actionListener

        button1 = new JButton("Black");
        button1.addActionListener(new Button1Listener());
        leftButtons.add(button1);

        button2 = new JButton("Green");
        button2.addActionListener(new Button2Listener());
        leftButtons.add(button2);

        button3 = new JButton("Blue");
        button3.addActionListener(new Button3Listener());
        leftButtons.add(button3);

        button4 = new JButton("Red");
        button4.addActionListener(new Button4Listener() );
        leftButtons.add(button4);

        small = new JButton("small");
        small.addActionListener(new smallListener());
        rightButtons.add(small);

        medium = new JButton("medium");
        medium.addActionListener(new mediumListener());
        rightButtons.add(medium);

        large = new JButton("large");
        large.addActionListener(new largeListener());
        rightButtons.add(large);

        clear = new JButton("clear");
        clear.addActionListener(new clearListener());
        rightButtons.add(clear);

        add(leftButtons, BorderLayout.WEST);
        add(rightButtons, BorderLayout.EAST);

    }

    //Implement ActionListener to set panel color, point size, and to clear

    public class Button1Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            mainPanel.setColor(Color.black);
        }
    }

    private class Button2Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            mainPanel.setColor(Color.green);
        }
    }

    private class Button3Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            mainPanel.setColor(Color.blue);
        }
    }

    private class Button4Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            mainPanel.setColor(Color.red);
        }
    }

    private class smallListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            mainPanel.setSize(3);

        }
    }

    private class mediumListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            mainPanel.setSize(10);
        }
    }

    private class largeListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            mainPanel.setSize(20);
        }

    }

    private class clearListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            mainPanel.clear();

        }
    }

}
