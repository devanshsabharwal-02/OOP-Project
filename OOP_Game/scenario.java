public class scenario extends game_instruction
{
    public scenario(String computer)
    {
        super(computer);
    }
    public void first() //The method being overidden according to the choices being made by the player(SUBSTITUTION PRINCIPLE)
    {
           // computer  =  ":"+ "AS YOU ARE UNTIED YOU PUSH ONE OF THE GUARD BY DISTRACTING THEM AND THEN MANAGE TO ESCAPE";
         setComputer(":"+ "AS YOU ARE UNTIED YOU PUSH ONE OF THE GUARD BY DISTRACTING THEM AND THEN MANAGE TO ESCAPE");
           System.out.println(getComputer());
    }
    public void second() //The method being overidden according to the choices being made by the player(SUBSTITUTION PRINCIPLE)
    {
         setComputer( ":"+ "YOU HAVE MANAGED TO ENTER THE CASTLE AND THERE YOU FIND A MYSTERIOUS NEON  ORB  AND AS YOU TOUCH IT EVERYTHING GOES BLACK");
         System.out.println(getComputer());
        }
    }
