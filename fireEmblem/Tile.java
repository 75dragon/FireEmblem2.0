package fireEmblem;

import javax.swing.JButton;

public class Tile extends JButton
{
    int x;
    int y;
    /**
     * @param x -x coordinate of tile
     * @param y -y coordinate of tile
     */
    public Tile(int x, int y)
    {
        this.x = x;
        this.y = y;
        System.out.println( "Tile created at: " + x + ", " + y );
    }
    
    public Tile()
    {
        
    }
    
    public int getX()
    {
        return x;
    }
    public void setX( int x )
    {
        this.x = x;
    }
    public int getY()
    {
        return y;
    }
    public void setY( int y )
    {
        this.y = y;
    }  
}
