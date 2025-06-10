package Pertemuan15.Latihan1_3;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloWorldForm3 extends JFrame implements ActionListener {
    private JLabel label;
    private JButton button;
    
    public HelloWorldForm3() {
        // Inisialisasi komponen
        label = new JLabel();
        label.setText("Hello world!");
        
        button = new JButton("Klik Me!");
        button.addActionListener(this);
        
        // Pengaturan layout dan penambahan komponen
        setLayout(new GridLayout(2, 1));
        add(label);
        add(button);
        
        // Pengaturan frame
        setTitle("My First Program");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        label.setText("Hallo Dunia!");
    }
}