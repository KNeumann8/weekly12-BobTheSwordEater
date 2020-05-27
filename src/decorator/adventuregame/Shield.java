package decorator.adventuregame;

public class Shield extends CharacterDecorator {

    public Shield(GameCharacter character) {
        // Call the constructor in the superclass (CharacterDecorator)
        //Yeah I ctrl c + ctrl v'd this
        super(character);
    }

    @Override
    public String getName() {
        return character.getName() + ", Shield-Chewer";
    }

    @Override
    public double getMight() {
        return character.getMight() + 15;
    }
}
