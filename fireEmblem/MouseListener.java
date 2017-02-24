package fireEmblem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MouseListener implements ActionListener
{
    Tile tile;


    public MouseListener( Tile tile )
    {
        this.tile = tile;
        System.out.println( "Made Clicker listener @" + tile.getX() + ", " + tile.getY() );
    }


    public MouseListener()
    {
        System.out.println( "Made Clicker listerer on a normal JButton" );
    }


    @Override
    public void actionPerformed( ActionEvent e )
    {
        if ( tile != null )
        {
            System.out.println( "Tile clicked at" + tile.getX() + ", " + tile.getY() );
        }
        else
        {
            System.out.println( "random tile was clicked" );
        }
    }
}
