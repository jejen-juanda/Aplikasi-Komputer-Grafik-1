package grafik;
//panggil framework yang dibutuhkan:
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
/**
 *
 * @author 171011402648
 */
//class dimulai dengan nama class adalahh GrafikCanvas
public class Gui extends JPanel{
    public Gui() {
//setting dimensi frame dan warna background:
        this.setPreferredSize(new Dimension(400, 400));
        this.setBackground(Color.GREEN);
    }
//buat fungsi paintComponent yang akan menggambar garis:
     public void paintComponent (Graphics g) {
        super.paintComponent (g);
        Graphics2D g2 = (Graphics2D)g;   
        //kode render grafik objek
        g2.drawRect(10, 10 , 388, 138);
        g2.drawString("Komputer Grafik - Latihan Membuat GUI", 130, 80);
    }
}