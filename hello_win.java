import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class TestFrame extends Frame {
    TestFrame() {
        Button b = new Button("Click me");
        b.setBounds(20, 100, 80, 50);
        b.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("we got clicked");
            }

        });
        add(b);
        setSize(250, 250);
        setTitle("Test Awt");
        setVisible(true);
    }
}

public class hello_win {
    public static void main(String[] arg) {
        TestFrame fr = new TestFrame();
    }
}
// // importing necessary libraries
// import java.awt.*;
// import java.awt.event.*;

// public class hello_win {
// public static void main(String[] args) {
// // create instance of frame with the label
// Frame f = new Frame("Button Example");
// final TextField tf = new TextField();
// tf.setBounds(50, 50, 150, 20);
// // create instance of button with label
// Button b = new Button("Click Here");
// // set the position for the button in frame
// b.setBounds(50, 100, 60, 30);
// b.addActionListener(new ActionListener() {
// public void actionPerformed(ActionEvent e) {
// tf.setText("Welcome to Javatpoint.");
// }
// });
// // adding button the frame
// f.add(b);
// // adding textfield the frame
// f.add(tf);
// // setting size, layout and visibility
// f.setSize(400, 400);
// f.setLayout(null);
// f.setVisible(true);
// }
// }