package Pertemuan15.Latihan1_2;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorldForm2 extends JFrame {
    private JLabel label;
    
    public HelloWorldForm2() {
        label = new JLabel();
        label.setText("Hello Daniel");
        add(label);
        
        setTitle("Program pertama");
        setSize(600, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}