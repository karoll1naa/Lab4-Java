package Main;

public class Letter {
    private final char character;
    public Letter(char character) {
        this.character = character;
    }
    public char getCharacter() {
        return character;
    }
    public String toString() {
        return String.valueOf(character);
    }
}