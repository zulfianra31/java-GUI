import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

public class Kalkulator {
    public static void main(String[] args){
        JFrame jendela = new JFrame();
        JPanel meja = new JPanel();
        GridLayout layout = new GridLayout(4,4);

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

        jendela.add(meja);
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

        tombol1.addActionListener(tombol1);

        jendela.setTitle("Kalkulator Java");
        jendela.setSize(400,500);


        jendela.setVisible(true);

    }
}
