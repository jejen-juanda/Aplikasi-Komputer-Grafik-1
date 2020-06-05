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
public class Arc extends JPanel{
    public Arc() {
//setting dimensi frame dan warna background:
        this.setPreferredSize(new Dimension(400, 400));
        this.setBackground(Color.GREEN);
    }
//buat fungsi paintComponent yang akan menggambar garis:
     public void paintComponent (Graphics g) {
        super.paintComponent (g);
        Graphics2D g2 = (Graphics2D)g;   
        //kode render grafik objek
        g2.setColor(Color.BLUE);
        g2.draw(new Arc2D.Double(20, 20, 180, 110, 120, 235, Arc2D.OPEN));
}
}