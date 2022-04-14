package TP.DialogBox;

import javax.swing.*;

public class DialogBox {

    public static void main(String[] args) {
        int nb1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number"));
        int nb2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second number"));

        int sum = nb1 + nb2;

        JOptionPane.showMessageDialog(null,
                "the sum is: " + sum,
                "Result", JOptionPane.INFORMATION_MESSAGE);
    }
}
