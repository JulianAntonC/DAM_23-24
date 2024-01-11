import javax.swing.*;
import java.awt.*;

public class Formulario extends JFrame {

    static private JLabel label1;

    public static void main(String args[]) {

        label1 = new JLabel("Esto es una prueba!");
        label1.setHorizontalAlignment(JLabel.CENTER);

        JButton button = new JButton("Submit");

        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(120, 40));

        JFrame frame = new JFrame();
        frame.setTitle("¡Saluda!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setSize(420,420);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.add(label1);
        frame.add(textField);
        frame.add(button);
        frame.pack();



    }
}