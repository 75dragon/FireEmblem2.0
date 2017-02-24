package fireEmblem;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class GameMap extends JPanel
{
    Tile[][] gameMap;
    int col;
    int row;

    public GameMap( int col, int row )
    {
        this.setLayout(new GridLayout(row, col));
        this.col = col;
        this.row = row;
        gameMap = new Tile[col][row];
        System.out.println( "done" );
        for ( int i = 0; i < row; i++ )
        {
            for ( int j = 0; j < col; j++ )
            {
                Tile tile = new Tile( j, i );
                gameMap[j][i] = tile;
                tile.addActionListener( new MouseListener(tile) );
                this.add( tile );
            }
        }
    }
}
