package grafik;
//panggil framework yang dibutuhkan:
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;
/**
 *
 * @author 171011402648
 */
//class dimulai dengan nama class Cubiccurve
public class Cubiccurve extends JPanel{
    public Cubiccurve() {
//setting dimensi frame dan warna background:
        this.setPreferredSize(new Dimension(750, 750));
        this.setBackground(Color.GREEN);
    }
//buat fungsi paintComponent yang akan menggambar garis:
     public void paintComponent (Graphics g) {
        super.paintComponent (g);
        Graphics2D g2 = (Graphics2D)g;   
        //kode render grafik objek
       CubicCurve2D kurva = new CubicCurve2D.Float();
       kurva.setCurve(10, 10, 50, 110, 110, 60, 170, 130);
       g2.draw(kurva);
    }
}