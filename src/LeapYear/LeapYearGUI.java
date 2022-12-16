package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearGUI extends JFrame {
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public LeapYearGUI() {
        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isLeapYear();
            }
        });
    }
    public static void main(String[] args) {
        LeapYearGUI app = new LeapYearGUI();
        app.setTitle("Leap Year Checker");
        app.setContentPane(app.panel1);
        app.setSize(200, 300);
        app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        app.setVisible(true);
    }

    public void isLeapYear() {
        String strYear = tfYear.getText();
        int intYear = Integer.parseInt(strYear);

        if (intYear % 4 != 0) {
            JOptionPane.showMessageDialog(panel1, "Not a leap year");
            return;
        }

        if (intYear % 100 != 0) {
            JOptionPane.showMessageDialog(panel1, "Leap year");
            return;
        }

        if (intYear % 400 != 0) {
            JOptionPane.showMessageDialog(panel1, "Not a leap year");
            return;
        }

        JOptionPane.showMessageDialog(panel1, "Leap year"); /* divisible by 400 */
        return;
    }
}