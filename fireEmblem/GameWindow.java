package fireEmblem;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameWindow extends JFrame
{
    public GameWindow(int x, int y)
    {
        super("Test");
        this.setVisible( true );
        this.setDefaultCloseOperation( EXIT_ON_CLOSE );
        this.getContentPane().setPreferredSize( new Dimension( x * 100, y * 100 ) );
        this.pack();
       
        GameMap map = new GameMap(x,y);
        this.add(map);
    }
    
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GameWindow(6,8);
            }
        });
    }
}
