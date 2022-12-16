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
    public static void ensurePositive(int num) throws Exception {
        if (num < 0) {
            throw new Exception("Input must not be a negative number");
        }
    }

    public void isLeapYear() {
        try {
            String strYear = tfYear.getText();
            int intYear = Integer.parseInt(strYear);

            ensurePositive(intYear);

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
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(panel1, "Input must be a number");
        } catch(Exception e) {
            JOptionPane.showMessageDialog(panel1, e.getMessage());
        }
    }
}