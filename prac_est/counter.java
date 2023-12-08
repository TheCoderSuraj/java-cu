package prac_est;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class counter extends JFrame {
    int i = 0;

    counter() {
        JLabel lbl = new JLabel("Counter " + i);
        lbl.setBounds(10, 10, 150, 25);
        add(lbl);
        JButton btn = new JButton("Increment");
        btn.setBounds(20, 40, 150, 40);
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                i++;
                lbl.setText("Counter " + i);
            }
        });
        add(btn);
        setSize(300, 250);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new counter();
    }
}
