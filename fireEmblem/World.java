package fireEmblem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class World
{
    long countOfTime;
    Timer gameRun;
    int row;
    int col;
    public World(int col, int row)
    {
        this.col = col;
        this.row = row;
        new GameWindow(col,row);
    }
    
    public void runGame()
    {
        int delay = 20;
        gameRun = new Timer( delay, new ActionListener()
        {

            @Override
            public void actionPerformed( ActionEvent e )
            {
                drawGame();
                countOfTime++;
            }

        } );
        gameRun.start();
    }
    
    public void drawGame()
    {
        
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
