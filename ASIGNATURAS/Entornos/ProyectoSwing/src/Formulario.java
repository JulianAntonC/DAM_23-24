import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formulario extends JFrame {

    private JLabel label1;
    private JTextField textField;
    private JButton submitButton;
    private JComboBox<String> comboBox1;
    private JButton showSelectedItemButton;


    public Formulario() {

        setTitle("Saluda!");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label1 = new JLabel("Escribe tu nombre");
        textField = new JTextField(20);
        submitButton = new JButton("Elegir");

        comboBox1 = new JComboBox<>();
        showSelectedItemButton = new JButton("Saludar");

        // Add ActionListener to the submit button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent introducirDatos) {
                // Get the text from the textField
                String enteredText = textField.getText();

                // Add the text to the comboBox
                comboBox1.addItem(enteredText);

                // Clear the text field
                textField.setText("");
                JOptionPane.showMessageDialog(Formulario.this, "¡Nombre elegido!", "Nuestro nombre", JOptionPane.PLAIN_MESSAGE);
            }
        });

        // Add ActionListener to the showSelectedItemButton
        showSelectedItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent saludar) {
                // Display the selected item from the comboBox
                String selectedItem = (String) comboBox1.getSelectedItem();
                JOptionPane.showMessageDialog(Formulario.this, "¡Hola " + selectedItem + " !");
            }
        });

        setLayout(new FlowLayout());

        add(label1);
        add(textField);
        add(submitButton);
        add(comboBox1);
        add(showSelectedItemButton);

    }

    public static void main(String[] args) {
        // Create and display the SimpleSwingExample JFrame
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FormularioCompleto().setVisible(true);
            }
        });
    }
}