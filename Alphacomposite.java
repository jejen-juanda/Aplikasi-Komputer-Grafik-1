package grafik;
//panggil framework yang dibutuhkan:
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.awt.image.*;
import javax.swing.*;
/**
 *
 * @author 171011402648
 */
//class dimulai dengan nama class Alphacomposite
public class Alphacomposite extends JPanel{
    public Alphacomposite() {
//setting dimensi frame dan warna background:
        this.setPreferredSize(new Dimension(750, 750));
        this.setBackground(Color.WHITE);
    }
//buat fungsi paintComponent yang akan menggambar garis:
     public void paintComponent (Graphics g) {
        super.paintComponent (g);
        Graphics2D g2 = (Graphics2D)g;   
g2.setColor(Color.BLUE);
g2.drawString("DESTINATION (Rectangle)", 40, 20);
g2.setColor(Color.RED);
g2.drawString("SOURCE (Circle)", 300, 20);
g2.setColor(Color.BLACK);
drawComposite(g2, 0.5f);
}
public void drawComposite(Graphics2D g2, float alpha) {
//jenis-jenis alpha composite
int [] alphaComp = {AlphaComposite.SRC, AlphaComposite.DST_IN,AlphaComposite.DST_OUT, AlphaComposite.DST_OVER,AlphaComposite.SRC_IN, AlphaComposite.SRC_OVER,AlphaComposite.SRC_OUT, AlphaComposite.CLEAR};
String [] caption = {"SRC", "DST_IN", "DST_OUT", "DST_OVER","SRC_IN", "SRC_OVER", "SRC_OUT", "CLEAR"};
// ambil objek alpha composite
int x, y;
x = y = 40;
AlphaComposite ac;
AlphaComposite tac =AlphaComposite.getInstance(AlphaComposite.SRC, 1.0f);
for (int j = 0; j < alphaComp.length; j++) {
//nilai alpha composite
ac = AlphaComposite.getInstance(alphaComp[j], alpha);
//begin: composite demo
BufferedImage buffImg =new BufferedImage(75, 80, BufferedImage.TYPE_INT_ARGB);
Graphics2D gbi = buffImg.createGraphics();
gbi.setColor(Color.BLUE);
gbi.fillRect(0, 0, 50, 50);
gbi.setColor(Color.RED);
gbi.setComposite(ac);
gbi.fillOval(25, 0, 50, 50);
//end: composite demo
//display image
g2.drawImage(buffImg, null, x, y);
g2.drawString(caption[j], x, y+70);
x += 80;
}
}
}