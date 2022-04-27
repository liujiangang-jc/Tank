import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TankFranme extends Frame {
    Tank myTank;

    private int x = 100, y = 100;
    public static final int SPEED = 5;

    public TankFranme() {
        this.setTitle("tank war");
        this.setLocation(400, 100);
        this.setSize(800, 600);

        this.addKeyListener(new TankKeyListener());
        myTank = new Tank(100,100,Dir.R);

    }

    @Override
    public void paint(Graphics g) {
        myTank.paint(g);

    }

    private class TankKeyListener extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent e) {

            myTank.keyPressed(e);


        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    }
}
