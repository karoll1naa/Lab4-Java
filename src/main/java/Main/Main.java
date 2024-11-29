package Main;

public class Main {
    public static void main(String[] args) {
        String inputText = "I still haven't done the lab on     operating systems(1). I don't like this subject(2). Can I remove it from the program?(3)";
        Text text = new Text(inputText);
        TextProcessor processor = new TextProcessor();
        processor.sortSentencesByWordCount(text);
    }
}
