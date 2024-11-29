package Main;
import java.util.ArrayList;
import java.util.List;

public class Word {
    private final List<Letter> letters = new ArrayList<>();
    public Word(String word) {
        for (char c : word.toCharArray()) {
            letters.add(new Letter(c));
        }
    }
    public List<Letter> getLetters() {
        return letters;
    }
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Letter letter : letters) {
            builder.append(letter.getCharacter());
        }
        return builder.toString();
    }
}
