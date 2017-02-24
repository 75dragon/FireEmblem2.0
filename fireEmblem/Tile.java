package fireEmblem;

import java.awt.Color;

import javax.swing.JButton;

public class Tile extends JButton
{
    int col;
    int row;
    String type;
    Hero occupied;
    Color color;
    boolean reachable = false;
    boolean filled = false;
    /**
     * @param x -x coordinate of tile
     * @param y -y coordinate of tile
     */
    public Tile(int col, int row)
    {
        this.col = col;
        this.row = row;
        System.out.println( "Tile created at: " + col + ", " + row );
    }

    public int getCol()
    {
        return col;
    }

    public void setCol( int col )
    {
        this.col = col;
    }

    public int getRow()
    {
        return row;
    }

    public void setRow( int row )
    {
        this.row = row;
    }
    
}
