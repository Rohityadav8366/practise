package DSA;
import javax.swing.*;
import java.awt.*;

class DrawRainbow extends JPanel{
    private final static Color VIOLET=new Color(128,0,128);
    private final static Color INDIGO=new Color(75,0,130);
    private Color[] colors={Color.white,Color.white,VIOLET,INDIGO,Color.blue,Color.GREEN,Color.YELLOW,Color.ORANGE,Color.RED};
    public DrawRainbow()
    {
        setBackground(Color.white);
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int radius = 20;
        int centerX = getWidth() / 2;
        int centerY = getHeight() - 10;
        for (int counter = colors.length; counter > 0; counter--) {
            g.setColor(colors[counter-1]);
            g.fillArc(centerX-counter*radius,centerY-counter*radius,counter*radius*2,counter*radius*2,0,180);
        }
    }
}
public class Rainbow {
    public static void main(String[] args) {
        DrawRainbow pl=new DrawRainbow();
        JFrame app=new JFrame();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(pl);
        app.setSize(400,250);
        app.setVisible(true);
    }
}
