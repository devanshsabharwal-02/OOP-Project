
class game
{
     String player;
    String antagonist;
    public game()
    {
        this.player=player;
        antagonist = "ANOC COBRA";
    }
    public void info(String player)  //The antagonist communicates information with the player (dialogue 1)
    {
        antagonist +=  ":" + "I hope you are fine Mr. " + player ;
        System.out.println(antagonist);
    }
    public void info2(String player) //The antagonist communicates information with the player (dialogue 2)
    {
         antagonist = ":" + "You can choose to reveal the intel and then i can let you go " + player;
         System.out.println(antagonist);
    }
    public void info3(String player) //The antagonist communicates information with the player (dialogue 3)
    {
        antagonist = ":" + "Now you will know what is worse than death " + player;
       System.out.println(antagonist);
    }
    public void info4(String player)  //The antagonist communicates information with the player (dialogue 4)
    {
        antagonist = ":" + "How do you feel after traversing so many realities. Now let's settle this once and for all in an iron sword fist fight " + player;
        System.out.println(antagonist);
    }
    public void info5(String player)  //The antagonist communicates information with the player (dialogue 5)
    {
        antagonist = ":" +  "You are a Strong person " +  player + " You can have what you want but spare me";
        System.out.println(antagonist);
    }
}
        