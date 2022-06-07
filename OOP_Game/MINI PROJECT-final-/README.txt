Student name: Devansh Sabharwal
Student number: 200000721

Now complete the statements below for each level you wish to be marked. Replace all text in square brackets.

LEVEL ONE(PLEASE,PLEASE ALSO REFER THE COMMENTS IN THE PROGRAM AS FOR A DEEPER ANALYSIS OF HOW/why/WHERE ARE THE PRINCIPLES  IMPLEMENTED ARE CLEARLY MENTIONED INSIDE THE BRACKETS)

My code demonstrates inheritance in the following way...

I have three superclasses called game_instructions ,game, choice

The superclass game_instructions  is extended into at least three subclasses called weapons, scenario and health

(FIRST(),SECOND(),THIRD(),FOURTH(),FIVE(),SIX,()GET COMPUTER,SETCOMPUTER()VILLIAN_HEALTH,HEALTH_PROGRESSION).

weapons(SUBCLASS OF GAME_INSTRUCTIONS)

Subclass [weapons] extends the superclass GAME_INSTRUCTIONS by introducing the player to weapons which will be used by the player in distinct waves/levels (there are methods which return the method) and also overrides the second() and third method() (according to choices made by the player)
adding at leastnd third method() and new properties are the types of weaponry such as ironfist_sword,machine gun and 
These/this new properties/property are used by the subclass in the following way: [Insert justification for adding the property and give the line numbers in the code of where the property is used.]



These overridden methods are used in the working code in the following places: [list the file names and line numbers where the overridden methods are called.]

 Health(Subclass 2 for game_instructions).

Subclass [health] extends the superclass by returning the level meter for the protagonist and the antagonist's health and adds the Property of progression bar(health_progression) which will determine player's health based on his choices and also overrides  methods five() and six()(which is for wining or loosing the game )
adding at least one property and its getters and setters. The name(s) of the added properties are [health_progression,vilian_health]

These/this new properties/property are used by the subclass in the following way: []


These overridden methods are used in the working code in the following places: [FIVE() AND SIX()]

Scenario(subclass 3 for game_instructions)subclass extends the superclass by overriding first() and second() according to the choices made by player
This s


Superclass 2 game which basically is the overall interaction with the villain

game_mechanics(subclass 1 for game)
This subclass extends by adding new properties such as options(which is a approach of stealth and rampage totally unto the player) and would later play a key role in deciding the morality and fate of player
(OPTION() AND MORALITY)


game_characters(subclass 2 for game)
This subclass extends the superclass by adding a property of the voice of the monsters and overiddes the method  info3(play)
AND IT INTRODUCES THE VOICE OF  MONSTERS (monsters())

Superclass 3 choice basically gives the player a wide range of choices to choose for which plays an important aspect in the game.(ask(), intel(), orb(),morality())

choose EXTENDS THE SUPERCLASS BY ADDING NEW PROPERTIES WHICH KIND OF DECIDES THE OUTCOME OF THE CHOICES WHICH THE PLAYER MAKES.(ask_O(), intel-O(), orb_O(),morality_O())

LEVEL TWO(PLEASE,PLEASE ALSO REFER THE COMMENTS IN THE PROGRAM AS FOR A DEEPER ANALYSIS OF HOW/why/WHERE ARE THE PRINCIPLES  IMPLEMENTED ARE CLEARLY MENTIONED INSIDE THE BRACKETS)

Polymorphism consists of the use of the Substitution principle and Late Dynamic binding.

In my code, polymorphism is implemented in at least two places…
(PLEASE DO HAVE A LOOK AT TEST_GAME EVERYTHING IS CLEARLY COMMENTED OVER THERE)

Example 1. 

The substitution principle can be seen in use in [class health,weapons and scenario used]. The name of the superclass is game_instructions a
Late dynamic binding can be seen in [TEST_GAME METHOD AND HOW THE OVERALL MECHANICS DECIDE THE PLAYER'S FATE].
It basically overrides the code according to the choices made by the player.
It is necessary as it basically gives player a wide variety of choices and impacts  the  overall gameplay
Example 2.

The substitution principle can be seen in use in [game_cahracters,. The name of the superclass used in this example is [game] and the subclasses used are [GAME_CHARACTERS AND ].

Late dynamic binding can be seen in [TEST_GAME].(IT IS THE FUNDAMENTAL COMPONENT/METHOD OF THIS PROJECT WHICH ALMOST BINDS EVERYTHING TOGETHER AND SHOWS THE WORKING OF THESE PRINCIPLES IN GENERAL)
The principles wherever impleneted are are commented inside brackets
It is necessary as a wide range of mechanics a re implemented via this
(FOR DEEPER ANALYSIS ECAH METHOD IS WELL COMMENTED AND ALSO SHOWS THE IMPLEMENTION OF POLYMORPHISM (SUBSTUTUTION PRINCIPLE AND LATE DYNAMIC BINDING PLEASE REFER THE COMMENTS IN THE PROGRAM)