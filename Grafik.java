package grafik;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;
import java.util.*;
import java.awt.geom.Point2D;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
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
private JButton tombol9;
private JButton tombola;
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
setSize (100,25);
setLocation(40, 10);
tombola = new JButton ("GUI");
tombola.setBackground(Color.RED);
tombola.addActionListener(this);
container.add(tombola);
setSize (50,50);
setLocation(10, 45);

tombol1 = new JButton ("Segi Empat");
tombol1.setBackground(Color.RED);
tombol1.addActionListener(this);
container.add(tombol1);
setSize (50,50);
setLocation(70, 45);
tombol2 = new JButton ("Segi Tiga");
tombol2.setBackground(Color.RED);
tombol2.addActionListener(this);
container.add(tombol2);
setSize (50,50);
setLocation(130, 45);
tombol3 = new JButton ("Clipping");
tombol3.setBackground(Color.RED);
tombol3.addActionListener(this);
container.add(tombol3);
setSize (50,50);
setLocation(10, 105);
tombol4 = new JButton ("AlphaComposite");
tombol4.setBackground(Color.RED);
tombol4.addActionListener(this);
container.add(tombol4);
setSize (50,50);
setLocation(70, 105);
tombol5 = new JButton ("Font Transformasi Affine");
tombol5.setBackground(Color.RED);
tombol5.addActionListener(this);
container.add(tombol5);
setSize (50,50);
setLocation(130, 105);
tombol6 = new JButton ("Font Render Context");
tombol6.setBackground(Color.RED);
tombol6.addActionListener(this);
container.add(tombol6);
setSize (50,50);
setLocation(10, 165);
tombol7 = new JButton ("Cubic Curve");
tombol7.setBackground(Color.RED);
tombol7.addActionListener(this);
container.add(tombol7);
setSize (50,50);
setLocation(70, 165);
tombol8 = new JButton ("Curve Spline");
tombol8.setBackground(Color.RED);
tombol8.addActionListener(this);
container.add(tombol8);
setSize (50,50);
setLocation(130, 165);
tombol9 = new JButton ("FEEDBACK");
tombol9.setBackground(Color.RED);
tombol9.addActionListener(this);
container.add(tombol9);
setSize (100,25);
setLocation(40, 225);
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
        JFrame frame = new JFrame("Aplikasi Grafik Kurva Spline Jejen Juanda");
        frame.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e) {System.exit(0);}
    });
Curvespline canvas = new Curvespline();
frame.getContentPane().add(canvas);
frame.pack();
frame.setVisible(true);
}
else if (e.getSource() == tombol9) {
JFrame frame = new JFrame();
frame.setTitle("FEEDBACK");
Feedback canvas = new Feedback();
frame.getContentPane().add(canvas);
frame.pack();
frame.setVisible(true);
}
else if (e.getSource() == tombola) {
JFrame frame = new JFrame();
frame.setTitle("Aplikasi Grafik GUI Jejen Juanda");
Gui canvas = new Gui();
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