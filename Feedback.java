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
//class dimulai dengan nama class Feedback
public class Feedback extends JPanel{
    public Feedback() {
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
g2.drawString("Kirim komentar, saran, dan masukkan anda!", 350, 10);
g2.drawString("E-mail", 10, 60);
g2.drawString("jejen.juanda@gmail.com", 650, 60);
g2.drawString("Telepon/Whatsapp/Telegram/SMS", 10, 110);
g2.drawString("082129537402", 650, 110);
}
}