package FoodOrdering;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class FoodOrderGUI extends JFrame {
    private JPanel panel1;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    List<JCheckBox> foods;
    List<JRadioButton> discounts;

    public FoodOrderGUI() {
        foods = new ArrayList<>();
        foods.add(cPizza);
        foods.add(cBurger);
        foods.add(cFries);
        foods.add(cSoftDrinks);
        foods.add(cTea);
        foods.add(cSundae);
        discounts = new ArrayList<>();
        discounts.add(rbNone);
        discounts.add(rb5);
        discounts.add(rb10);
        discounts.add(rb15);

        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                compute();
            }
        });
    }

    public static void main(String[] args) {
        FoodOrderGUI app = new FoodOrderGUI();
        app.setTitle("Food Ordering System");
        app.setContentPane(app.panel1);
        app.setSize(600, 500);
        app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        app.setVisible(true);
    }

    public void compute() {
        // TODO
        double[] foodCosts = {100.00, 80.00, 65.00, 55.00, 50.00, 40.00};
        double[] foodDiscounts = {0.00, 0.05, 0.10, 0.15};
        int index = 0;
        double total = 0.00;
        for (JCheckBox cb : foods) {
            if (cb.isSelected()) {
                total = total + foodCosts[index];
            }
            index++;
        }
        index = 0;
        for (JRadioButton rb : discounts) {
            if (rb.isSelected()) {
                double discount = total * foodDiscounts[index];
                total = total - discount;
                break;
            }
            index++;
        }

        DecimalFormat df = new DecimalFormat("0.00");
        String formatted = df.format(total);
        JOptionPane.showMessageDialog(panel1, "The total price is Php " + formatted);
        return;
    }
}