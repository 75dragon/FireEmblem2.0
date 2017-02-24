package fireEmblem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MouseListener implements ActionListener
{
    Tile tile;

    public MouseListener( Tile tile )
    {
        this.tile = tile;
        System.out.println( "Made Clicker listener @" + tile.getCol() + ", " + tile.getRow() );
    }

    @Override
    public void actionPerformed( ActionEvent e )
    {
        System.out.println( "random tile was clicked" );
    }
}
