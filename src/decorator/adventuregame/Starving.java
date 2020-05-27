package decorator.adventuregame;

public class Starving extends CharacterDecorator{

    public Starving(GameCharacter character) {
        // Call the constructor in the superclass (CharacterDecorator)
        //Yeah I ctrl c + ctrl v'd this
        super(character);
    }

    @Override
    public String getName() {
        return character.getName() + ", Starving";
    }

    @Override
    public double getMight() {
        return character.getMight() - 20;
    }
}
