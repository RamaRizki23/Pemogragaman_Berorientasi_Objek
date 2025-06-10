package Pertemuan15.StudiKasus2_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PenjumlahanApp extends JFrame implements ActionListener {
    private JTextField field1;
    private JTextField field2;
    private JButton tombolHitung;

    public PenjumlahanApp() {
        // Konfigurasi frame
        setTitle("Program Penjumlahan");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        // Komponen input
        add(new JLabel("Nilai Pertama:"));
        field1 = new JTextField();
        add(field1);

        add(new JLabel("Nilai Kedua:"));
        field2 = new JTextField();
        add(field2);

        // Tombol hitung
        tombolHitung = new JButton("Hitung");
        tombolHitung.addActionListener(this);
        add(tombolHitung);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double nilai1 = Double.parseDouble(field1.getText());
            double nilai2 = Double.parseDouble(field2.getText());
            double hasil = nilai1 + nilai2;

            JOptionPane.showMessageDialog(this, 
                "Hasil: " + hasil, 
                "Hasil Penjumlahan", 
                JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, 
                "Masukkan angka yang valid!", 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PenjumlahanApp app = new PenjumlahanApp();
            app.setVisible(true);
        });
    }
}