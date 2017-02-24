package fireEmblem;

public abstract class Weapon
{
    int passiveType; //0 for passive, 1 for start of turn, 2/3 for above/below %, 4 for spur, 5 for defending.
    
    String name;
    
    Hero weilder;
    
    int attack;

    int range;

    boolean physical;

    String color;

    String killer;

    String advantage;

    public abstract int attack( Hero defender );
    
    public abstract void passive();

    public int getPassiveType()
    {
        return passiveType;
    }

    public String getName()
    {
        return name;
    }

    public Hero getWeilder()
    {
        return weilder;
    }

    public int getAttack()
    {
        return attack;
    }

    public int getRange()
    {
        return range;
    }

    public boolean isPhysical()
    {
        return physical;
    }

    public String getColor()
    {
        return color;
    }

    public String getKiller()
    {
        return killer;
    }

    public String getAdvantage()
    {
        return advantage;
    }



    public class BolganonePlus extends Weapon
    {
        public BolganonePlus(Hero weilder)
        {
            this.weilder = weilder;
            attack = 11;
            range = 2;
            physical = false;
            color = "R";
            killer = "";
            advantage = "";
            name = "Bonlganone+";
        }


        @Override
        public int attack( Hero defender )
        {
            // TODO Auto-generated method stub
            return 0;
        }


        @Override
        public void passive()
        {
            return;
        }

    }
}
