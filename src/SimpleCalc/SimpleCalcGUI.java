package SimpleCalc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// Kyle A. Canonigo - Fork

// Dev Branch
public class SimpleCalcGUI extends JFrame {
    private JPanel panel1;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber2;
    private JTextField lblResult;

    public SimpleCalcGUI() {
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                compute();
            }
        });
    }

    public static void main(String[] args) {
        SimpleCalcGUI app = new SimpleCalcGUI();
        app.setTitle("Simple Calculator");
        app.setContentPane(app.panel1);
        app.setSize(600, 300);
        app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        app.setVisible(true);
    }

    public void compute() {
        try {
            int result = 0;
            String strNumber1 = tfNumber1.getText();
            String strNumber2 = tfNumber2.getText();

            int intNumber1 = Integer.parseInt(strNumber1);
            int intNumber2 = Integer.parseInt(strNumber2);

            switch (cbOperations.getSelectedItem().toString()) {
                case "+":
                    result = (intNumber1 + intNumber2);
                    break;
                case "-":
                    result = (intNumber1 - intNumber2);
                    break;
                case "*":
                    result = (intNumber1 * intNumber2);
                    break;
                case "/":
                    result = (intNumber1 / intNumber2);
                    break;
            }

            String strResult = Integer.toString(result);
            lblResult.setText(strResult);
            lblResult.setEditable(false);
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(panel1, "Input must be a number");
        } catch(ArithmeticException e) {
            JOptionPane.showMessageDialog(panel1, "Cannot divide by zero");
        }
    }
}