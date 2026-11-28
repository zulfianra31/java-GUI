import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import java.awt.BorderLayout;

public class Kalkulator {
    public static void main(String[] args){
        JFrame jendela = new JFrame();
        JPanel meja = new JPanel();
        GridLayout layout = new GridLayout(4,4);
        jendela.setTitle("Kalkulator Java");
        JTextField layar = new JTextField();


        JButton tombol1 = new JButton("1");
        JButton tombol2 = new JButton("2");
        JButton tombol3 = new JButton("3");
        JButton tombol4 = new JButton("4");
        JButton tombol5 = new JButton("5");
        JButton tombol6 = new JButton("6");
        JButton tombol7 = new JButton("7");
        JButton tombol8 = new JButton("8");
        JButton tombol9 = new JButton("9");
        JButton tomboltambah = new JButton("+");
        JButton tombol0 = new JButton("0");
        JButton tombolkurang = new JButton("-");
        JButton tombolkali = new JButton("x");
        JButton tombolbagi = new JButton(":");
        JButton tombolsamadengan = new JButton("=");

        jendela.setLayout(new BorderLayout());

        jendela.add(layar,BorderLayout.NORTH);
        jendela.add(meja, BorderLayout.CENTER);
        meja.setLayout(layout);
        meja.add(tombol1);
        meja.add(tombol2);
        meja.add(tombol3);
        meja.add(tombol4);
        meja.add(tombol5);
        meja.add(tombol6);
        meja.add(tombol7);
        meja.add(tombol8);
        meja.add(tombol9);
        meja.add(tomboltambah);
        meja.add(tombol0);
        meja.add(tombolkurang);
        meja.add(tombolbagi);
        meja.add(tombolkali);
        meja.add(tombolsamadengan);


        tombol1.addActionListener(e ->{
            layar.setText(layar.getText() + tombol1.getText());
        });
        tombol2.addActionListener(e -> {
            layar.setText(layar.getText() + tombol2.getText());
        });
        tombol3.addActionListener(e -> {
            layar.setText(layar.getText() + tombol3.getText());
        });
        tombol4.addActionListener(e -> {
            layar.setText(layar.getText() + tombol4.getText());
        });
        tombol5.addActionListener(e -> {
            layar.setText(layar.getText() + tombol5.getText());
        });
        tombol6.addActionListener(e -> {
            layar.setText(layar.getText() + tombol6.getText());
        });
        tombol7.addActionListener(e -> {
            layar.setText(layar.getText() + tombol7.getText());
        });
        tombol8.addActionListener(e -> {
            layar.setText(layar.getText() + tombol8.getText());
        });
        tombol9.addActionListener(e -> {
            layar.setText(layar.getText() + tombol9.getText());
        });

        tombol0.addActionListener(e -> {
            layar.setText(layar.getText() + tombol0.getText());
        });

        tomboltambah.addActionListener(e -> {
            layar.setText(layar.getText() + " + ");
        });

        tombolsamadengan.addActionListener(e -> {
            String[] bagian = layar.getText().split("\\+");

            int angkaPertama = Integer.parseInt(bagian[0].trim());
            int angkaKedua = Integer.parseInt(bagian[1].trim());

            int hasil = angkaPertama + angkaKedua;
            layar.setText(String.valueOf(hasil));
        });

        tombolkurang.addActionListener(e -> {
            layar.setText(layar.getText() + " - ");
        });

        tombolsamadengan.addActionListener(e -> {
            String[] bagian = layar.getText().split("-");

            int angkaPertama = Integer.parseInt(bagian[0].trim());
            int angkaKedua = Integer.parseInt(bagian[1].trim());

            int hasil = angkaPertama - angkaKedua;
            layar.setText(String.valueOf(hasil));
        });

        jendela.setSize(400,500);


        jendela.setVisible(true);

    }
}
