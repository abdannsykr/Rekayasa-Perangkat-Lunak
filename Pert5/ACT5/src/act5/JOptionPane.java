package act5;

import javax.swing.JOptionPane;

public class latihan extends javax.swing.JFrame {

    // Constructor or other initialization code

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        try {
            // Your code here (for example, handling the JComboBox action)
            // Assuming you want to do something when the combo box selection changes
            String selectedItem = jComboBox1.getSelectedItem().toString();
            // Perform actions based on the selected item
            System.out.println("Selected item: " + selectedItem);
        } catch (Exception e) {
            // Show an error message using JOptionPane
            JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // Other code and methods
    
}
