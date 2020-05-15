package grafik;
//panggil framework yang dibutuhkan:
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.awt.image.*;
import javax.swing.*;
import javax.imageio.*;
import java.io.*;
/**
 *
 * @author 171011402648
 */
//class dimulai dengan nama class Clipping
public class Clipping extends JPanel{
    public Clipping() {
//setting dimensi frame dan warna background:
        this.setPreferredSize(new Dimension(750, 750));
        this.setBackground(Color.BLACK);
    }
//buat fungsi paintComponent yang akan menggambar garis:
     public void paintComponent (Graphics g) {
        super.paintComponent (g);
        Graphics2D g2 = (Graphics2D)g;   
        //kode render grafik objek
try {
BufferedImage img = ImageIO.read(new File("medina.jpg"));
//clipp
Shape lingkaran = new Ellipse2D.Double(30, 30, 250, 250);
g2.clip(lingkaran);
g2.drawImage(img, 10, 10, 400, 300, null);
g2.setClip(null);
g2.drawString("Clipping: medina", 100, 350);
//gambar asli
g2.drawImage(img, 300, 10, 400, 300, null);
g2.drawString("Gambar asli: medina", 400, 350);
    }
catch(Exception e)
{
}
}
}