package grafik;
//panggil framework yang dibutuhkan:
import java.awt.*;
import java.awt.event.*;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.*;
import javax.swing.*;
/**
 *
 * @author 171011402648
 */
//class Fontrender
public class Fontrender extends JPanel{
    public Fontrender() {
//setting dimensi frame dan warna background:
        this.setPreferredSize(new Dimension(750, 750));
        this.setBackground(Color.GREEN);
    }
//buat fungsi paintComponent yang akan menggambar garis:
     public void paintComponent (Graphics g) {
        super.paintComponent (g);
        Graphics2D g2 = (Graphics2D)g;   
        //menentukan nama, bentuk dan ukuran font
Font font = new Font("Serif", Font.BOLD|Font.PLAIN|Font.ITALIC, 70);
FontRenderContext frc = g2.getFontRenderContext();
GlyphVector gv = font.createGlyphVector(frc, "Wim Sonevel");
Shape glyph = gv.getOutline(100,100);
g2.setStroke(new BasicStroke(3.0f));
g2.rotate(Math.toRadians(45), 100, 100);
g2.draw(glyph);
g2.setColor(Color.blue);
g2.fill(glyph);
}
}