package fireEmblem;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class GameMap extends JPanel
{
    Tile[][] gameMap;
    int xDim;
    int yDim;

    public GameMap( int x, int y )
    {
        this.setLayout(new GridLayout(y, x));
        xDim = x;
        yDim = y;
        gameMap = new Tile[x][y];
        System.out.println( "done" );
        for ( int i = 0; i < yDim; i++ )
        {
            for ( int j = 0; j < xDim; j++ )
            {
                Tile tile = new Tile( i, j );
                gameMap[j][i] = tile;
                tile.addActionListener( new MouseListener(tile) );
                this.add( tile );
            }
        }
    }
}
