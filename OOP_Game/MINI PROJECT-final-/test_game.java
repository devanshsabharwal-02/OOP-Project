import java.util.*;
class test_game
{
    public static void main(String [] a)
    {
        Scanner sc= new Scanner(System.in);
           game_instruction g_i = new game_instruction("computer");
        game g = new game();
        choice c = new choice();
       
       
        System.out.println("Enter your name");
        String player = sc.nextLine();
          game_instruction h = new health("computer",100,100); // dynamic binding       //  health heal = (health)g_i;// type conversion for health
        h.getpro_health();   // HEAL ADDING NEW PROPERTY
        //WAVE 0
        System.out.println("*******************************************************************************************************************");
        g.info(player);
        g_i.first();
       
        c.ask();
         
        choose ci = new choose();                   //choose ci = (choose)c; // type conversion
        String play= sc.nextLine();
        ci.ask_O(play); // type conversion for choose(choice)
        System.out.println("*******************************************************************************************************************");
        
        
        
        //WAVE1
        System.out.println("*******************************************************************************************************************");
        g.info2(player);
        c.intel();
        play= sc.nextLine();
        ci.intel_O(play);
        c.untie();
        play= sc.nextLine();
        ci.untie_O(play);
        scenario scene = new scenario("computer");// dynamic binding for scenario
        scene.first();  // dynamic binding
       
        h.health_progression(play); //type conversion for health
        h.getpro_health();
        h.getan_health();  // HEAL ADDING NEW PROPERTY
        h.vilian_health();
        
        
        System.out.println("*******************************************************************************************************************");

        
        
        //WAVE2
        System.out.println("*******************************************************************************************************************");
        g.info3(player);
        g_i.second();
        game_characters gic = new game_characters(); // dynamic binding for game characters
        gic.info3(player);  // dynamic binding
             game_mechanics gm = new game_mechanics();     //game_mechanics gm = (game_mechanics)g; //type conversion for game_mechanics
        gm.option(); // type conversioon gm
        System.out.println("Choose Wisely");
        play= sc.nextLine();
        ci.morality(play);
         weapons we = new weapons("computer"); // dynamic binding weapons
        if(play.equals("rampage"))
        {

            we.second(); // dynamic binding
        }
         c.orb();
         play= sc.nextLine();
         ci.orb_O(play);
         scene.second();//dynamic binding
        h.health_progression(play); //type conversion
        h.getpro_health();
        h.getan_health(); // HEAL ADDING NEW PROPERTY
        h.vilian_health();
        System.out.println("*******************************************************************************************************************");
        
        
        //WAVE3
       System.out.println("*******************************************************************************************************************");
       g_i.third();
        c.act();
       System.out.println("Choose Wisely");
       play= sc.nextLine();
         //game_characters gc = (game_characters)g;// type conversion for game characters
       gic.monsters(); // gic
       ci.act_O(play);
       if(play.equals("a"))
        {

            we.third(); // dynamic binding
        }
        h.health_progression(play); //type conversion
        h.getpro_health();
        h.getan_health(); // HEAL ADDING NEW PROPERTY
        h.vilian_health();
       System.out.println("*******************************************************************************************************************");
       
       
       //FINAL WAVE
      System.out.println("*******************************************************************************************************************");
      gm.morality();
      g_i.fourth();
      c.final_act();
      System.out.println("Choose Wisely and type in the option you choose");
      play = sc.nextLine();
      if(play.equals("b") )
      g.info5(player);
       
       System.out.println("please enter the most recent health and morality already displayed on your screen to determine your fate");
       int health = sc.nextInt();
       int morality = sc.nextInt();
        if((health<75) && (morality>9))
        {
       g_i.five(health,morality);
       h.five(health,morality);// dynamic binding health 2 //NO MOD
    }
        if((health>75) && (morality<10))
       {
       g_i.six(health,morality);
       h.six(health,morality); //dynamic binding health 2 // NO MOD
    }
      else if (play.equals("a") )
      {
          gm.morality();
             // health ht = new health(); // dynamic binding
       System.out.println("please enter the most recent health and morality already displayed on your screen to determine your fate");
        health = sc.nextInt();
       morality = sc.nextInt();
        if((health<75) && (morality>9))
        {
       g_i.five(health,morality);
       h.five(health,morality);// dynamic binding health 2
        if((health>75) && (morality<10))
       {
       g_i.six(health,morality);
       h.six(health,morality); //dynamic binding health 2
         System.out.println("*******************************************************************************************************************");
        }
     }
    }
    }
}