public class Character {
    // Attributes
    int strength;
    int agility;
    int intelligence;
    String name;

   

    // Constructor
    public Character(int str, int agi, int intel, String characterName) {
        strength = str; 
        agility = agi;
        intelligence = intel;
        name = characterName;
        System.out.println("my name is " + name + "\n" + "my strength is " + strength + "\n" + "my agility is " + agility + "\n" + "my intelligence is " + intelligence);

    }
}
