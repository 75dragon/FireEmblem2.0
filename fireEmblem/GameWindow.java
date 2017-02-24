package fireEmblem;

import java.awt.Dimension;

import javax.swing.JFrame;

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
}
