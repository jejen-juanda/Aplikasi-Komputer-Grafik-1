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
//class dimulai dengan nama class adalah GrafikCanvas
public class Rectangle extends JPanel{
    public Rectangle() {
//setting dimensi frame dan warna background:
        this.setPreferredSize(new Dimension(400, 400));
        this.setBackground(Color.GREEN);
    }
//buat fungsi paintComponent yang akan menggambar garis:
     public void paintComponent (Graphics g) {
        super.paintComponent (g);
        Graphics2D g2 = (Graphics2D)g;   
        //kode render grafik objek
        g2.draw(new Rectangle2D.Double(15, 15, 179, 108));
    }
}