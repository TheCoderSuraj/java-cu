package prac_est;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class jmenus extends JFrame {
    jmenus() {
        JMenuItem i1, i2, i3, i4, i5;
        JMenu m1 = new JMenu("menu");
        JMenu m2 = new JMenu("submenu");

        i1 = new JMenuItem("Test");
        i2 = new JMenuItem("Test1");
        i3 = new JMenuItem("Test2");
        i4 = new JMenuItem("Testq");
        i5 = new JMenuItem("Test4");
        m1.add(i1);
        m1.add(i2);
        m1.add(i3);
        m2.add(i4);
        m2.add(i5);
        m1.add(m2);
        JMenuBar mb = new JMenuBar();
        mb.add(m1);
        mb.setBounds(10, 25, 200, 100);
        add(mb);
        setJMenuBar(mb);
        setSize(300, 250);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new jmenus();
    }
}
