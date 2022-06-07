class game_characters extends game
{
    String monsters;
    public game_characters()
    {
        super();
        monsters="Please Spare Us we let you no harm !";
    }
    public void monsters()  // Monster's voice (NEW PROPERTY)
    {
        System.out.println("MONSTERS: " + monsters);
    }
     public void info3(String player) // overrides the dialogue by the antagonist (SUBSTITUTION PRINCIPLE)
    {
         antagonist = ":" + "You are a clever man like me " + player;
       System.out.println(antagonist);
    }
}