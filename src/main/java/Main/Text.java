package Main;
import java.util.ArrayList;
import java.util.List;

public class Text {
    private final List<Sentence> sentences = new ArrayList<>();
    public Text(String text) {
        text = text.replaceAll("\\s+", " ");
        String[] rawSentences = text.split("(?<=\\.)");
        for (String rawSentence : rawSentences) {
            sentences.add(new Sentence(rawSentence.trim()));
        }
    }
    public List<Sentence> getSentences() {
        return sentences;
    }
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Sentence sentence : sentences) {
            builder.append(sentence).append(" ");
        }
        return builder.toString().trim();
    }
}
