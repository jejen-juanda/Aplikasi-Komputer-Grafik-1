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
//class dimulai dengan nama class adalahh GrafikCanvas
public class QuadCurve extends JPanel{
    public QuadCurve() {
//setting dimensi frame dan warna background:
        this.setPreferredSize(new Dimension(400, 400));
        this.setBackground(Color.GREEN);
    }
//buat fungsi paintComponent yang akan menggambar garis:
     public void paintComponent (Graphics g) {
        super.paintComponent (g);
        Graphics2D g2 = (Graphics2D)g;   
        //kode render grafik objek
        QuadCurve2D kurva = new QuadCurve2D.Float();
        kurva.setCurve(55, 15, 125, 215, 185, 15);
        g2.draw(kurva);
    }
}