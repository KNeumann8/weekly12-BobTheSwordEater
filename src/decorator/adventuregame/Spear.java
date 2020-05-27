package decorator.adventuregame;

public class Spear extends CharacterDecorator {

    public Spear(GameCharacter character) {
        // Call the constructor in the superclass (CharacterDecorator)
        super(character);
    }

    @Override
    public double getMight() {
        return character.getMight() + 5;
    }

    @Override
    public String getName() {
        return character.getName() + ", Spear-Swallower";
    }
}
