package FoodOrdering;

import javax.swing.*;
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
    }

    public static void main(String[] args) {
        FoodOrderGUI app = new FoodOrderGUI();
        app.setTitle("Food Ordering System");
        app.setContentPane(app.panel1);
        app.setSize(600, 500);
        app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        app.setVisible(true);
    }

    void compute() {

    }
}