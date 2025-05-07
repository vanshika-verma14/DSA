import javax.swing.*;
import java.awt.*;

public class k {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Layout Demo");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // --- FlowLayout Example ---
        JPanel flowPanel = new JPanel();
        flowPanel.setLayout(new FlowLayout());
        flowPanel.add(new JButton("One"));
        flowPanel.add(new JButton("Two"));
        flowPanel.add(new JButton("Three"));

        // --- BorderLayout Example ---
        JPanel borderPanel = new JPanel();
        borderPanel.setLayout(new BorderLayout());
        borderPanel.add(new JButton("North"), BorderLayout.NORTH);
        borderPanel.add(new JButton("South"), BorderLayout.SOUTH);
        borderPanel.add(new JButton("East"), BorderLayout.EAST);
        borderPanel.add(new JButton("West"), BorderLayout.WEST);
        borderPanel.add(new JButton("Center"), BorderLayout.CENTER);

        // --- GridLayout Example ---
        JPanel gridPanel = new JPanel();
        gridPanel.setLayout(new GridLayout(2, 2));
        gridPanel.add(new JButton("A"));
        gridPanel.add(new JButton("B"));
        gridPanel.add(new JButton("C"));
        gridPanel.add(new JButton("D"));

        // Add panels to tabbed pane
        JTabbedPane tabs = new JTabbedPane();
        tabs.add("Flow", flowPanel);
        tabs.add("Border", borderPanel);
        tabs.add("Grid", gridPanel);

        frame.add(tabs);
        frame.setVisible(true);
    }
}
