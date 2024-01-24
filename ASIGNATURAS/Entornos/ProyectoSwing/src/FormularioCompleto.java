import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FormularioCompleto extends JFrame {

    private JLabel nombre;
    private JTextField nameField;
    private JLabel provincia;
    private JComboBox<String> comboBox1;
    private JLabel edad;
    private JSpinner edadSpinner;
    private JCheckBox adsCheck;
    private JButton confirmarDatos;
    private JLabel genero;
    private JRadioButton option1;
    private JRadioButton option2;
    private JRadioButton option3;

    public FormularioCompleto() {
        setTitle("Saluda!");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Personal Information Panel
        JPanel personalInfoPanel = new JPanel(new GridLayout(2, 2));
        nombre = new JLabel("Nombre:");
        nameField = new JTextField(20);
        edad = new JLabel("Edad:");
        SpinnerModel edadModel = new SpinnerNumberModel(18, 18, 99, 1);
        edadSpinner = new JSpinner(edadModel);
        personalInfoPanel.add(nombre);
        personalInfoPanel.add(nameField);
        personalInfoPanel.add(edad);
        personalInfoPanel.add(edadSpinner);

        // Address Panel
        JPanel addressPanel = new JPanel(new FlowLayout());
        provincia = new JLabel("Provincia:");
        comboBox1 = new JComboBox<>();
        comboBox1.addItem("Alicante");
        comboBox1.addItem("Valencia");
        comboBox1.addItem("Asturias");
        addressPanel.add(provincia);
        addressPanel.add(comboBox1);

        // Gender Panel
        JPanel genderPanel = new JPanel(new GridLayout(1, 3));
        genero = new JLabel("Genero:");
        option1 = new JRadioButton("Hombre");
        option2 = new JRadioButton("Mujer");
        option3 = new JRadioButton("No binario");
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(option1);
        buttonGroup.add(option2);
        buttonGroup.add(option3);
        genderPanel.add(genero);
        genderPanel.add(option1);
        genderPanel.add(option2);
        genderPanel.add(option3);

        // Button Panel
        JPanel buttonPanel = new JPanel(new FlowLayout());
        adsCheck = new JCheckBox("Aceptar anuncios");
        confirmarDatos = new JButton("Enviar");
        confirmarDatos.setEnabled(false);
        adsCheck.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent checkAds) {
                confirmarDatos.setEnabled(checkAds.getStateChange() == ItemEvent.SELECTED);
            }
        });
        confirmarDatos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent saludar) {
                // Display a confirmation dialog
                String enteredName = nameField.getText();

                Object selectedAge = edadSpinner.getValue();

                String selectedItem = (String) comboBox1.getSelectedItem();

                String selectedGender = "N/A";
                if (option1.isSelected()) {
                    selectedGender = option1.getText();
                } else if (option2.isSelected()) {
                    selectedGender = option2.getText();
                } else if (option3.isSelected()) {
                    selectedGender = option3.getText();
                }

                int option = JOptionPane.showConfirmDialog(FormularioCompleto.this,
                        "¿Confirma que los datos son correctos?\n" + enteredName + "\n" + selectedAge + "\n" + selectedItem + "\n" + selectedGender + "\nAcepta recibir publicidad.",
                        "Confirmar Datos", JOptionPane.YES_NO_OPTION);

                // Check user's response
                if (option == JOptionPane.YES_OPTION) {
                    // User clicked Yes, perform further actions or close the window
                    JOptionPane.showMessageDialog(FormularioCompleto.this, "¡Gracias por introducir sus datos!");
                    dispose(); // Close the window, adjust as needed
                } else {
                    // User clicked No, do nothing or handle accordingly
                }
            }
        });

        buttonPanel.add(adsCheck);
        buttonPanel.add(confirmarDatos);

        // Main Content Pane
        JPanel mainPanel = new JPanel(new GridLayout(4, 1));
        mainPanel.add(personalInfoPanel);
        mainPanel.add(addressPanel);
        mainPanel.add(genderPanel);
        mainPanel.add(buttonPanel);
        setLayout(new BorderLayout());
        add(mainPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FormularioCompleto().setVisible(true);
            }
        });
    }
}