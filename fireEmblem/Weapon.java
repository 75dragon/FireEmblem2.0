package fireEmblem;

public abstract class Weapon
{
    String name;
    
    Hero weilder;
    
    int attack;

    int range;

    boolean physical;

    String color;

    String killer;

    String advantage;

    public abstract int attack( Hero defender );


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

    }
}
