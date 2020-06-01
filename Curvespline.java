package grafik;
//panggil framework yang dibutuhkan:
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;
import java.util.*;
import java.awt.geom.Point2D;
/**
 *
 * @author 171011402648
 */
//class dimulai dengan nama class Persegi
public class Curvespline extends JPanel{
    public Curvespline() {
//setting dimensi frame dan warna background:
        this.setPreferredSize(new Dimension(750, 750));
        this.setBackground(Color.GREEN);
    }
//buat fungsi paintComponent yang akan menggambar garis:
     public void paintComponent (Graphics g) {
        super.paintComponent (g);
        Graphics2D g2 = (Graphics2D)g;   
        //kode render grafik objek
        Shape sh1 = new CubicCurve2D.Double(70,220, 120,120,170, 220, 220, 220);
        Shape sh2 = new CubicCurve2D.Double(220,220, 270,220,320, 120, 370, 220);
        g2.setColor(Color.GREEN);
        g2.draw(sh1);
        g2.draw(sh2);
    }
}