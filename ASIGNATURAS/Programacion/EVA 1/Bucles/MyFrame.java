import javax.swing.*;
import java.awt.Color;
import javax.swing.JOptionPane;

public class MyFrame {
	public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setTitle("¡Saluda!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setSize(420,420);
        frame.setVisible(true);

        ImageIcon image = new ImageIcon("logo.png");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(new Color(0xFFFFFF));

    }
}