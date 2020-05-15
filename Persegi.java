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
//class dimulai dengan nama class Persegi
public class Persegi extends JPanel{
    public Persegi() {
//setting dimensi frame dan warna background:
        this.setPreferredSize(new Dimension(750, 750));
        this.setBackground(Color.GREEN);
    }
//buat fungsi paintComponent yang akan menggambar garis:
     public void paintComponent (Graphics g) {
        super.paintComponent (g);
        Graphics2D g2 = (Graphics2D)g;   
        //kode render grafik objek
     Point2D titik1 = new Point2D.Double(10, 10);
        Point2D titik2 = new Point2D.Double(10, 110);
        Point2D titik3 = new Point2D.Double(110, 10);
        Point2D titik4 = new Point2D.Double(110, 110);
//Buat garis sesuai titik di atas:
        Line2D garis1 = new Line2D.Double(titik1, titik2);
        Line2D garis2 = new Line2D.Double(titik3, titik4);        
        Line2D garis3 = new Line2D.Double(titik1, titik3);        
        Line2D garis4 = new Line2D.Double(titik2, titik4);        
//Tampilkan garis ke layar sesuai        garis yang telah terbentuk di atas:
g2.draw(garis1);
g2.draw(garis2);
g2.draw(garis3);
g2.draw(garis4);
    };
}