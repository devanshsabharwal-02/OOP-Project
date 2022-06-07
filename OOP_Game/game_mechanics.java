import java.util.*;
class game_mechanics extends game
{
    String stealth;
    String rampage;
    int morality;
    public game_mechanics()
    {
        super();
        stealth="";
        rampage="";
        morality=10;
    }
    public void morality()  // morality mechanic plays a crucial part in deciding he fate(NEW PROPERTY)
    {
        System.out.println("Your Morality is : " + morality);
    }
    public void option() // stealth and rampage approaches can be decided by the player(NEW PROPERTY)
    {
        stealth = "CAREFULLY AND SILENTLY GO PAST THE GUARDS BY SILENTLY DISARMING THEM AND BY NOT KILLING ANYONE";
        System.out.println("stealth:"+stealth);
        rampage = "PICK UP THE MACHINE GUN AND KILL EACH AND EVERY PERSON WITHOUT SHOWING ANY MERCY";
         System.out.println("rampage:"+ rampage);
    }
   
}
        
    
   