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
//class dimulai dengan nama class Fontaffine
public class Fontaffine extends JPanel{
    public Fontaffine() {
//setting dimensi frame dan warna background:
        this.setPreferredSize(new Dimension(750, 750));
        this.setBackground(Color.GREEN);
    }
//buat fungsi paintComponent yang akan menggambar garis:
     public void paintComponent (Graphics g) {
        super.paintComponent (g);
        Graphics2D g2 = (Graphics2D)g;   
        //menentukan nama, bentuk dan ukuran font
Font font = new Font("Serif", Font.BOLD, 75);
//transformasi affine
AffineTransform tx = new AffineTransform();
        tx.shear(0.5, 0.1);
        //font turunan hasil modifikasi dengan transformasi affine
g2.setFont(font.deriveFont(tx));
g2.drawString("Nur Medina Raisha", 50, 50);
    }
}