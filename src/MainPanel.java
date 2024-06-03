import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {
    private JButton btnShow;
    private JComboBox<String> cmbObjects;
    private JLabel lblFilename;
    private JTextArea txtArea;
    private GridBagConstraints gbc = new GridBagConstraints();

    public MainPanel() {
        setLayout(new GridBagLayout());
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.ipadx = 25; // Laius kõigil lahtritel
        gbc.fill = GridBagConstraints.HORIZONTAL;  // Täida kogu lahter

        firstLine();
        secondLine();
        thirdLine();
    }

    private void firstLine() {

        cmbObjects = new JComboBox<>(new String[] {"Vali kujund", "Kera", "Silinder"});
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(cmbObjects, gbc);

        btnShow = new JButton("Näita ja salvesta");
        gbc.gridx = 2;
        gbc.gridy = 0;
        add(btnShow, gbc);
    }
    private void secondLine() {
        lblFilename = new JLabel("Salvestuse fail");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 3;
        add(lblFilename, gbc);
    }
    private void thirdLine() {
        txtArea = new JTextArea(15, 45);
        JScrollPane scrollPane = new JScrollPane(txtArea);
        gbc.gridx = 0;
        gbc.gridy = 2;
        //gbc.gridwidth = 3; // Siin on sama mis varem muudetud 3
        add(scrollPane, gbc);
    }



    public JButton getBtnShow() {
        return btnShow;
    }

    public JComboBox<String> getCmbObjects() {
        return cmbObjects;
    }

    public JLabel getLblFilename() {
        return lblFilename;
    }

    public JTextArea getTxtArea() {
        return txtArea;
    }

}
