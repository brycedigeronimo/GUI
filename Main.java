import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();

        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(500, 200);
        mainFrame.setVisible(true);
        mainFrame.setTitle("Main");

    }
}