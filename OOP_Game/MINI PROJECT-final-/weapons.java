class weapons extends game_instruction
{
    String machine_gun;
    String species_destroyer;
    String sword_ironfist;
public weapons(String computer)
{
    super(computer);
    this.machine_gun=machine_gun;
    this.species_destroyer=species_destroyer;
    this.sword_ironfist=sword_ironfist;
}
public String machine_gun()  // returns machine gun
{
    return machine_gun;
}
public String species_destroyer()  // returns species_destroyer
{
    return species_destroyer;
}
public String sword_ironfist()  // returns sword_ironfist
{
    return sword_ironfist;
}
public void second(int s)  // overwrites the method according to choices made by the player(SUBSTITUTION PRINCIPLE)
{
     setComputer (":" + "YOU HAVE USED THE MACHINE GUN AND WITH A LOT OF RAGE AND INFLICTED BRUTALITY KILLED THE GURADS WHOM YOU DID NOT EVEN KNOW");
     System.out.println(getComputer());
 }
    
public void third() // overwrites the method according to choices made by the player(SUBSTITUTION PRINCIPLE)
{
{
    setComputer (":" + "YOU HAVE USED THE SPECIES DESTROYER WHICH IS A SHARP BEAMY LIKE OBJECT AND IT SHOT A GIANT LASER BEAM IN THE SKY AND IT ERADICTED THE ENTIRE SPECIES OF THE ISLAND ");
    System.out.println(getComputer());
}
}
}