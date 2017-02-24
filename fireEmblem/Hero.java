package fireEmblem;

import FireEmblem.Weapon;

public class Hero
{
    String name;

    int col; // location

    int row;

    int maxHp;

    int hp;

    int atk;

    int atkChange = 0; // all ___Change are debuffs and buffs.

    int spd;

    int spdChange = 0;

    int def;

    int defChange = 0;

    int res;

    int resChange = 0;

    boolean alive = true;

    String classes;

    Weapon weapon;

    World world;

    boolean hasTurn = true;

    boolean hasAtk = true;


    public Hero( String name, int hp, int atk, int spd, int def, int res, String classes, Weapon weapon, World world )
    {
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
        this.atk = atk;
        this.spd = spd;
        this.def = def;
        this.res = res;
        this.classes = classes;
        this.weapon = weapon;
        this.world = world;
    }


    public boolean SetLocation( int col, int row )
    {
        if ( world.map.getTile( col, row ).getOccupied() == null && world.map.getTile( col, row ).getType().equals( "grass" ) )
        {
            world.map.getTile( col, row ).setOccupied( this );
            this.col = col;
            this.row = row;
            return true;
        }
        return false;
    }


    public boolean moveLocation( int x, int y )
    {
        if ( world.map.getTile( x, y ).getOccupied() == null )
        {
            world.map.getTile( this.x, this.y ).setOccupied( null );
            world.map.getTile( x, y ).setOccupied( this );
            this.x = x;
            this.y = y;
            return true;
        }
        return false;
    }


    // takes damageTaken damage.
    void takeDamage( int damageTaken )
    {
        if ( damageTaken <= 0 )// you cant take negative damage
        {
            System.out.println( "   " + name + " has taken 0 damage!" );
            return;
        }
        if ( damageTaken > 0 )// hits for damageTaken
        {
            hp = hp - damageTaken;
            System.out.println( "   " + name + " has taken " + damageTaken + " damage!" );
        }
        if ( hp < 0 )// you dead boi
        {
            System.out.println( "   " + name + " has been defeated!" );
            alive = false;
        }
    }


    // heals for healValue, cannot exceed maxHp.
    void heal( int healValue )
    {
        hp = hp + healValue;
        if ( hp > maxHp )
        {
            hp = maxHp;
        }
    }


    // prints stats. what else?
    void printStats()
    {
        System.out.println( name );
        System.out.println( "Hp: " + getHp() + "/" + maxHp );
        System.out.println( "Atk: " + getAtk() );
        System.out.println( "Spd: " + getSpd() );
        System.out.println( "Def: " + getDef() );
        System.out.println( "Res: " + getRes() );
    }
    
    public String getName()
    {
        return name;
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


    public int getMaxHp()
    {
        return maxHp;
    }


    public int getHp()
    {
        return hp;
    }


    public void setHp( int hp )
    {
        this.hp = hp;
    }


    public int getAtk()
    {
        return atk + atkChange + weapon.getAttack();
    }


    public int getAtkChange()
    {
        return atkChange;
    }


    public void setAtkChange( int atkChange )
    {
        this.atkChange = this.atkChange + atkChange;
    }


    public int getSpd()
    {
        return spd + spdChange;
    }


    public int getSpdChange()
    {
        return spdChange;
    }


    public void setSpdChange( int spdChange )
    {
        this.spdChange = this.spdChange + spdChange;
    }


    public int getDef()
    {
        return def + defChange;
    }


    public int getDefChange()
    {
        return defChange;
    }


    public void setDefChange( int defChange )
    {
        this.defChange = this.defChange + defChange;
    }


    public int getRes()
    {
        return res + resChange;
    }


    public int getResChange()
    {
        return resChange;
    }


    public void setResChange( int resChange )
    {
        this.resChange = this.resChange + resChange;
    }


    public boolean isAlive()
    {
        return alive;
    }


    public void setAlive( boolean alive )
    {
        this.alive = alive;
    }


    public String getClasses()
    {
        return classes;
    }


    public Weapon getWeapon()
    {
        return weapon;
    }

    public boolean isHasTurn()
    {
        return hasTurn;
    }

    public void setHasTurn( boolean hasTurn )
    {
        this.hasTurn = hasTurn;
    }

    public boolean isHasAtk()
    {
        return hasAtk;
    }

    public void setHasAtk( boolean hasAtk )
    {
        this.hasAtk = hasAtk;
    }
}
