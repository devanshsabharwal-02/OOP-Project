class game_instruction  
{
    private String computer;
    public game_instruction(String computer)
    {
        this.computer=computer;
    }
    public int getpro_health() // returns protagonist's health
{
    return 100 ;
}
public int getan_health() // returns antoganist;s health
{
    return 100;
}
public void health_progression(String play) // how the progression of health will play out in the game depending on player's choices(NEW PROPERTY)
{
   System.out.println("progress");
}

public void vilian_health()//(NEW PROPERTY)
{
     System.out.println("health");
}
    public String getComputer()
    {
        return computer;
    }
    public void setComputer(String newcomputer)
    {
        computer = newcomputer;
    }
    public void first() // first tutorial session in which the computer describes the location
    {
        computer  +=  ":"+ "YOU ARE TIED TO A CHAIR WITH A THICK JUTE ROPE AND THERE \nARE THREE MUSCULAR BUILT GIANT MEN HOLDING A RIFFLE AND A TALL HANDSOME SWEDISH GUY STANDING INFRONT OF YOU"; 
        System.out.println(computer);
    }
    public void second()  // second  session in which the computer describes the next encounter
    {
      computer =  ":" + "YOU ARE SUDDENLY TRANSPORTED TO AN ISLAND GUARDED WITH HEAVILY ARMED GUNNED MAN AND THE ONLY WAY TO ESCAPE IS \nTO ENTER THE PORTAL TO TRANSMIT YOU TO ANOTHER REALITY AND FIND THE INTEL INSIDE THE CASTLE  ";
      System.out.println(computer);
    }
    public void third()  // third  session in which the computer describes the next encounter
    {
        computer =  ":" + "YOU MANAGED TO REACH THE CASTLE AND NOW YOU ARE SUDDENLY TRANSPORTED TO ANOTHER DIMENSION \nYOU FIND THE WAY INTO ANOTHER REALITY AND NOW YOU ARE IN AN ISLAND MANIFESTED WITH INSECTS AND MOSNTERS BUT THEY MEAN NO HARM \nAND YOU SUDDENLY FIND A WEAPON LYING ON THE GROUND WHICH COULD ERADICATE THE ENTIRE SPECIES OF THE ISLAND";
        System.out.println(computer);
    }
    public void fourth() // fourth  session in which the computer describes the next encounter
    {
        computer  =  ":" + "YOU SEE ANOC COBRA STANDING FACE TO FACE WITH A HUGE BULKY BODY WITH A SWORD AND AN IRON FIST \nYOU HAVE TO FIGHT WITH HIM NOW INORDER TO STOP THE INTEL FROM GETTING REVEALED";
        System.out.println(computer);
     }
 
    public void five(int health,int morality) // fate of the player
    {
  
        computer  =  ":" + "YOU HAVE LOST THE GAME";
        System.out.println(computer);
    }
    
        public void six(int health,int morality) // fate of the player
      {
         computer =  ":" + "YOU HAVE WON THE GAME";
        System.out.println(computer);
    }
}
