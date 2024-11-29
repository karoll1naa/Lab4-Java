package Main;
import java.util.ArrayList;
import java.util.List;

public class Sentence {
    private final List<Word> words = new ArrayList<>();
    private final List<Punctuation> punctuations = new ArrayList<>();
    public Sentence(String sentence) {
        String[] parts = sentence.split("(?<=\\.)|\\s+");
        for (String part : parts) {
            if (part.matches("\\p{Punct}")) {
                punctuations.add(new Punctuation(part.charAt(0)));
            } else if (!part.isBlank()) {
                words.add(new Word(part));
            }
        }
    }
    public List<Word> getWords() {
        return words;
    }
    public List<Punctuation> getPunctuations() {
        return punctuations;
    }
    public int getWordCount() {
        return words.size();
    }
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Word word : words) {
            builder.append(word).append(" ");
        }
        for (Punctuation punctuation : punctuations) {
            builder.append(punctuation);
        }
        return builder.toString().trim();
    }
}