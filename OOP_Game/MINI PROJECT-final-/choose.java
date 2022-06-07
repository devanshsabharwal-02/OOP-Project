import java.util.*;
class choose extends choice
{
    private String play;
    private int morality;
    public choose()
    {
        super();
        Scanner sc = new Scanner(System.in);
        this.play=play;
        morality=10;
    }
    public void ask_O(String play) // choices providing details about the alternate scenarios which will impact player's choice(NEW PROPERTY)
    {
        if(play.equals("a"))
        System.out.println( "Let's just say we are aquaintances");
        else if(play.equals("b"))
        System.out.println ("It's your new home");
        else
        System.out.println("invalid");
    }
    public void intel_O(String play) // choices providing details about the alternate scenarios which will impact player's choice(NEW PROPERTY)
    {
          if(play.equals("a"))
        System.out.println("Very well Kill him");
        else if(play.equals("b"))
        System.out.println("Untie him so I can Kill him myself");
        else
        System.out.println("invalid");
    }
  public void untie_O(String play)  // Choices need to be made by the player which will affect the story and game(3)(NEW PROPERTY)
   { 
        if(play.equals("a"))
        System.out.println("Where the hell do you think you are going ?");
        else if(play.equals("b"))
        System.out.println("Finish Him Once And for All ");
        else
        System.out.println("invalid");
    }
    public void orb_O(String play)  // Choices need to be made by the player which will affect the story and game(4)(NEW PROPERTY)
    {
        if(play.equals("a"))
        System.out.println("The neon beam passes through your body");
        else if(play.equals("b"))
        System.out.println("COWARD !");
        else
        System.out.println("invalid");
    }
      public void morality(String play) // choices  providing details about the alternate scenarios which will impact player's choice (NEW PROPERTY)
 {
     System.out.println("Your morality will decipher the quality of humanity still remains in you");
     if(play.equals("Stealth")| play.equals("b"))
         morality=morality;
         else if(play.equals("rampage") | play.equals("b"))
         morality=morality-1;
}
  public void act_O(String play) // choices  providing the details about the alternate scenarios which will impact player's choice (NEW PROPERTY)
  {
      if(play.equals("Stealth")| play.equals("b"))
         morality=morality;
         else if(play.equals("rampage") | play.equals("b"))
         morality=morality-5;
         System.out.println("Morality : " + morality);
   }
 
}
        