import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args){
        TankFranme tf = new TankFranme();
        tf.setVisible(true);

        for (;;) {
           try{
             Thread.sleep(50);
           }catch (InterruptedException e){
               e.printStackTrace();
           }
            tf.repaint();
        }


    }

}
