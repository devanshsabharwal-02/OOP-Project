public  class choice
{
    private String a;
    private String b;
    private int reality;
    
    public choice()
    {
        a="";
        b="";
        this.reality=reality;
    }
    public void  ask()  // Choices need to be made by the player which will affect the story and game(1)
    {
        a = "OPTION a: WHO ARE YOU ? ";
        b = "OPTION b: WHERE AM I ?";
        System.out.println("Please enter a or b TO CONTINUE");
        System.out.println(a);
        System.out.println(b);
    }
    public void intel()  // Choices need to be made by the player which will affect the story and game(2)
    {
        a = "OPTION a: GO TO HELL";
        b = "OPTION b: REVEAL THE INTEL";
        System.out.println("Please enter a or b TO CONTINUE");
        System.out.println(a);
        System.out.println(b);
 }
 public void untie()  // Choices need to be made by the player which will affect the story and game(3)
 {
        a = "OPTION a: DISTRACT THE GUARDS AS THEY UTIE YOU AND ESCAPE" ;
        b = "OPTION b: DO NOTHING";
        System.out.println("Please enter a or b TO CONTINUE");
        System.out.println(a);
        System.out.println(b);
    }
    public void orb()  // Choices need to be made by the player which will affect the story and game(4)
    {
        a = "OPTION a: ENTER THE CASTLE " ;
        b = "OPTION b: RUN AWAY";
        System.out.println("Please enter a or b TO CONTINUE");
        System.out.println(a);
        System.out.println(b);
    }
 public void act()  // Choices need to be made by the player which will affect the story and game(5)
 {
     a = "OPTION a: BRUTALLY SLAUGHTER THE SPECIES OF THE ENTIRE ISLAND AND THEN ESCAPE";
     b = "OPTION b: ESCAPE THE ISLAND WITHOUT KILLING ANYONE";
      System.out.println("Please enter a or b TO CONTINUE");
       System.out.println(a);
       System.out.println(b);
 }
 public void final_act() // // Choices need to be made by the player which will affect the story and game(5)
 {
      a = "OPTION a: SHOOT HIM";
      b = "OPTION b: ENGAGE IN A FIST FIGHT";
       System.out.println("Please enter a or b TO CONTINUE");
       System.out.println(a);
       System.out.println(b);
}
}