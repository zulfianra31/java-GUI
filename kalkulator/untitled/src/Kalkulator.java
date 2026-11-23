import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.GridLayout;

public class Kalkulator {
    public static void main(String[] args){
        JFrame jendela = new JFrame();
        JPanel meja = new JPanel();
        JButton tombol = new JButton();
        GridLayout layout = new GridLayout(4,4);

        jendela.add(meja);
        meja.add(tombol);

        jendela.setTitle("Kalkulator Java");
        jendela.setSize(400,500);

        layout.getRows();

        tombol.setPreferredSize(new Dimension(60, 50));
        tombol.setText("1");



        jendela.setVisible(true);




    }
}
