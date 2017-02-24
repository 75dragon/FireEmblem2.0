package fireEmblem;

import java.awt.Dimension;

import javax.swing.JFrame;

public class GameWindow extends JFrame
{
    public GameWindow(int col, int row)
    {
        super("Test");
        this.setVisible( true );
        this.setDefaultCloseOperation( EXIT_ON_CLOSE );
        this.getContentPane().setPreferredSize( new Dimension( col * 100, row * 100 ) );
        this.pack();
       
        GameMap map = new GameMap(col,row);
        this.add(map);
    }
}
