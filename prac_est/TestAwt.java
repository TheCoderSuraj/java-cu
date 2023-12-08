package prac_est;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class TestAwt extends Frame {
    TestAwt() {
        Label ta = new Label("I am suraj");
        ta.setBounds(30, 50, 150, 25);
        add(ta);
        // ta.setText("I am good boy");

        // text field
        // TextField tf = new TextField();
        // tf.setBounds(20, 80, 200, 40);
        // add(tf);

        // text field
        TextArea tf = new TextArea();
        tf.setBounds(20, 80, 200, 80);
        add(tf);

        // checkbox

        // CheckboxGroup cbg = new CheckboxGroup();
        // // Checkbox ch = new Checkbox();
        // Checkbox ch1 = new Checkbox("what do you say", cbg, true);
        // Checkbox ch = new Checkbox("show input", cbg, true);

        // ch.addItemListener(new ItemListener() {

        // @Override
        // public void itemStateChanged(ItemEvent e) {
        // // tf.setVisible(ch.getState());
        // System.out.println("ch" + ch.getState());
        // System.out.println("ch1" + ch1.getState());
        // }

        // });
        // ch.setBounds(20, 165, 150, 15);
        // add(ch);
        // ch1.addItemListener(new ItemListener() {

        // @Override
        // public void itemStateChanged(ItemEvent e) {
        // // tf.setVisible(ch1.getState());
        // System.out.println("ch" + ch.getState());
        // System.out.println("ch1" + ch1.getState());
        // }

        // });
        // ch1.setBounds(20, 190, 150, 15);
        // add(ch1);

        // choice
        // Choice c = new Choice();
        // c.add("Item 1");
        // c.add("Item 2");
        // c.add("Item 3");
        // c.add("Item 4");

        // c.setBounds(20, 160, 150, 25);
        // add(c);

        // list
        List list = new List();
        list.add("Suraj");
        list.add("Kiran");
        list.add("Airi");
        list.setBounds(20, 160, 150, 45);
        add(list);
        // called on double click
        list.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                System.out.println("we got another clicked" + list.getSelectedIndex());
            }
        });

        // button
        Button btn = new Button("Click me");
        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // System.out.println("we got a button pressed");
                // ta.setText(tf.getText());
                // tf.setText("");
                // // System.out.println(c.getSelectedIndex());// choice

                // System.out.println(list.getSelectedIndex());// choice

            }

        });

        btn.setBounds(50, 200, 150, 50);
        add(btn);

        // container
        setSize(new Dimension(300, 250));
        setTitle("Test Title");
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TestAwt();
    }
}
