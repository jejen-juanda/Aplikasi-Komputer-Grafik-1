package grafik;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;
/**
 *
 * @author 171011402648
 */
//class grafik
public class Grafik extends JFrame implements ActionListener {
private JButton tombol0;
private JButton tombol1;
private JButton tombol2;
private JButton tombol3;
private JButton tombol4;
private JButton tombol5;
private JButton tombol6;
private JButton tombol7;
private JButton tombol8;
public Grafik() {
super ("Aplikasi Grafik");
this.setPreferredSize(new Dimension(750, 750));
this.setBackground(Color.WHITE);
Container container = getContentPane();
container.setLayout(new FlowLayout());
tombol0 = new JButton ("Tentang");
tombol0.setBackground(Color.RED);
tombol0.addActionListener(this);
container.add(tombol0);
setSize (50,50);
setLocation(10, 10);
tombol1 = new JButton ("Segi Empat");
tombol1.setBackground(Color.RED);
tombol1.addActionListener(this);
container.add(tombol1);
setSize (50,50);
setLocation(70, 10);
tombol2 = new JButton ("Segi Tiga");
tombol2.setBackground(Color.RED);
tombol2.addActionListener(this);
container.add(tombol2);
setSize (50,50);
setLocation(120, 10);
tombol3 = new JButton ("Clipping");
tombol3.setBackground(Color.RED);
tombol3.addActionListener(this);
container.add(tombol3);
setSize (50,50);
setLocation(10, 70);
tombol4 = new JButton ("AlphaComposite");
tombol4.setBackground(Color.RED);
tombol4.addActionListener(this);
container.add(tombol4);
setSize (50,50);
setLocation(70, 70);
tombol5 = new JButton ("Font Transformasi Affine");
tombol5.setBackground(Color.RED);
tombol5.addActionListener(this);
container.add(tombol5);
setSize (50,50);
setLocation(120, 70);
tombol6 = new JButton ("Font Render Context");
tombol6.setBackground(Color.RED);
tombol6.addActionListener(this);
container.add(tombol6);
setSize (50,50);
setLocation(10, 120);
tombol7 = new JButton ("Cubic Curve");
tombol7.setBackground(Color.RED);
tombol7.addActionListener(this);
container.add(tombol7);
setSize (50,50);
setLocation(70, 120);
tombol8 = new JButton ("FEEDBACK");
tombol8.setBackground(Color.RED);
tombol8.addActionListener(this);
container.add(tombol8);
setSize (50,50);
setLocation(120, 120);
setVisible (true);
}
public static void main (String arg[]) {
Grafik grafik = new Grafik();
grafik.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed (ActionEvent e) {
if (e.getSource() == tombol1) {
JFrame frame = new JFrame();
frame.setTitle("Aplikasi Grafik persegi Jejen Juanda");
Persegi canvas = new Persegi();
frame.getContentPane().add(canvas);
frame.pack();
frame.setVisible(true);
}
else if (e.getSource() == tombol2) {
JFrame frame = new JFrame();
frame.setTitle("Aplikasi Grafik Segi Tiga Jejen Juanda");
Segitiga canvas = new Segitiga();
frame.getContentPane().add(canvas);
frame.pack();
frame.setVisible(true);
}
else if (e.getSource() == tombol3) {
JFrame frame = new JFrame();
frame.setTitle("Aplikasi Grafik Clipping Jejen Juanda");
Clipping canvas = new Clipping();
frame.getContentPane().add(canvas);
frame.pack();
frame.setVisible(true);
}
else if (e.getSource() == tombol4) {
JFrame frame = new JFrame();
frame.setTitle("Aplikasi Grafik AlphaComposite Jejen Juanda");
Alphacomposite canvas = new Alphacomposite();
frame.getContentPane().add(canvas);
frame.pack();
frame.setVisible(true);
}
else if (e.getSource() == tombol5) {
JFrame frame = new JFrame();
frame.setTitle("Aplikasi Grafik Font Transformasi Affine Jejen Juanda");
Fontaffine canvas = new Fontaffine();
frame.getContentPane().add(canvas);
frame.pack();
frame.setVisible(true);
}
else if (e.getSource() == tombol6) {
JFrame frame = new JFrame();
frame.setTitle("Aplikasi Grafik Font Render Context Jejen Juanda");
Fontrender canvas = new Fontrender();
frame.getContentPane().add(canvas);
frame.pack();
frame.setVisible(true);
}
else if (e.getSource() == tombol7) {
JFrame frame = new JFrame();
frame.setTitle("Aplikasi Grafik Cubic Curve Jejen Juanda");
Cubiccurve canvas = new Cubiccurve();
frame.getContentPane().add(canvas);
frame.pack();
frame.setVisible(true);
}
else if (e.getSource() == tombol8) {
JFrame frame = new JFrame();
frame.setTitle("FEEDBACK");
Feedback canvas = new Feedback();
frame.getContentPane().add(canvas);
frame.pack();
frame.setVisible(true);
}
else {
JFrame frame = new JFrame();
frame.setTitle("Tentang");
Tentang canvas = new Tentang();
frame.getContentPane().add(canvas);
frame.pack();
frame.setVisible(true);
}
}
}