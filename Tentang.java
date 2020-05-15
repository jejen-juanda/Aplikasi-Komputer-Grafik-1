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
//class dimulai dengan nama class Tentang
public class Tentang extends JPanel{
    public Tentang() {
//setting dimensi frame dan warna background:
        this.setPreferredSize(new Dimension(750, 750));
        this.setBackground(Color.GREEN);
    }
//buat fungsi paintComponent yang akan menggambar garis:
     public void paintComponent (Graphics g) {
        super.paintComponent (g);
        Graphics2D g2 = (Graphics2D)g;   
        //menentukan nama, bentuk dan ukuran font
Font font = new Font("Arial", Font.BOLD, 50);
g2.drawString("Aplikasi Komputer Grafik1", 10, 10);
g2.drawString("Dibuat oleh Jejen Juanda", 60, 10);
g2.drawString("171011402648", 10, 60);
g2.drawString("06TPLE106", 60, 60);
g2.drawString("Teknik Informatika", 10, 110);
g2.drawString("Universitas Pamulang", 60, 110);
    }
}