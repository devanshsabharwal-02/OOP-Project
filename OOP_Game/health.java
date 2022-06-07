public class health extends game_instruction
{
    private int pro_health;
    private int an_health;
public health(String computer,int pro_health,int an_health)
{
    super(computer);
    this.pro_health = pro_health;
    this.an_health = an_health;
}
public int getpro_health() // returns protagonist's health
{
    return pro_health;
}
public int getan_health() // returns antoganist;s health
{
    return an_health;
}
public void health_progression(String play) // how the progression of health will play out in the game depending on player's choices(NEW PROPERTY)
{
   if(play.equals("rampage") | play.equals("a"))
   {
       pro_health -= 20;
       an_health ++;
       System.out.println("YOUR HEALTH IS : " + pro_health);
    }
    else if(play.equals("stealth") | play.equals("b"))
    {
        an_health -= 20;
        pro_health -= 5;
        System.out.println("YOUR HEALTH IS : " + pro_health);
}
}
public void vilian_health()//(NEW PROPERTY)
{
    System.out.println("ANOC COBRA'S HEALTH : " + an_health);
}
public void five(int health,int morality ) //The method being overidden and asks for health displayed already on screen which is crucial to decide player's fate (SUBSTITUTION PRINCIPLE)
    {
        if((health<75) && (morality>9))
        setComputer  ( ":" + "YOU HAVE LOST THE GAME BUT ATLEAST THERE IS STILL SOME HUMANITY LEFT  IN YOU");
        System.out.println(getComputer());
    }
    
    public void six(int health,int morality)//The method being overidden and asks for health displayed already on screen which is crucial to decide player's (SUBSTITUTION PRINCIPLE)
    {
        if((health>75) && (morality<10))
         setComputer  (  ":" + "YOU HAVE WON THE GAME BUT YOU ARE NOW A MONSTER AS YOU HAVE KILLED AND DESTROYED OTHER THINGS FOR YOUR SELFISH MEANS \nCONGRATULATIONS! YOU WON THE GAME AT THE COST OF YOUR HUMANITY");
         System.out.println(getComputer());
        }
    }