
import javax.swing.*;
import java.awt.*;


public class GUI {
    public GUI() {
        JFrame frame = new JFrame();

        JButton button = new JButton("Employee Incidents ");
        JButton button1 = new JButton("Incident Activity");
        JButton button2 = new JButton("Document Incident");
        JLabel label = new JLabel("IT SECURITY DATABASE");
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));
        panel.setLayout(new GridLayout(0 ,1 ));
        panel.add(label);
        panel.add(button);
        panel.add(button1);
        panel.add(button2);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("IT SECURITY DATABASE");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args){
        new GUI();

    }


}
