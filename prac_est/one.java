package prac_est;

import java.awt.*;
import java.awt.event.*;

public class one {
    public static void main(String args[]) {
        int i = 0;
        Frame frame = new Frame();
        Label label = new Label("Counter");
        label.setBounds(40, 40, 40, 40);
        frame.add(label);
        TextField counter = new TextField(Integer.toString(i)); // Convert int to String here
        counter.setBounds(60, 60, 60, 60);
        frame.add(counter);
        frame.setSize(300, 300);
        Button B1 = new Button("Increment"); // Give the button a label
        B1.setBounds(20, 20, 80, 20); // Adjust width to accommodate the label
        frame.add(B1);
        B1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                i++;
                counter.setText(Integer.toString(i));
            }
        });
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
