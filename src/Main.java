// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // Create the JFrame
        JFrame frame = new JFrame("My Swing App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a JPanel and add it to the JFrame
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Create a JButton and add it to the JPanel
        JButton button = new JButton("Click me!");
        panel.add(button);

        // Add the JPanel to the JFrame
        frame.add(panel);

        // Make the JFrame visible
        frame.setVisible(true);
    }
}

