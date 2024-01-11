import javax.swing.JFrame;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MyFrame {
	public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setTitle("¡Saluda!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setSize(420,420);
        frame.setVisible(true);

        JTextField greet = new JTextField();
        
        

        ImageIcon image = new ImageIcon("logo.png");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(new Color(0xFFFFFF));

    }
}