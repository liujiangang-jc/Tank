import java.awt.*;
import java.awt.event.KeyEvent;

public class Tank {
    private int x, y;
    public static final int SPEED = 5;
    private Dir dir = Dir.R;

    public Tank(int x, int y, Dir dir) {
        this.x = x;
        this.y = y;
        this.dir = dir;
    }

    public void paint(Graphics g) {
        g.fillRect(x,y,50,50);

    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        switch (key) {
            case KeyEvent.VK_LEFT:
                dir = Dir.L;
                break;
            case KeyEvent.VK_UP:
                dir = Dir.U;
                break;
            case KeyEvent.VK_RIGHT:
                dir = Dir.R;
                break;
            case KeyEvent.VK_DOWN:
                dir = Dir.D;
                break;
        }
        mmove();
    }

    private void mmove() {
        switch (dir){
            case L:
                x -= SPEED;
            case U:
                y -= SPEED;
            case R:
                x += SPEED;
            case D:
                y += SPEED;
        }
    }
}
