package repeatedWord;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class RepeatedWord {

    public static Serializable repeatedWord(String input) {
        if (input != "") {
            Set<String> texts = new HashSet<>();

            String[] words = input.toLowerCase().split("[\\s,]+");
            for (String text : words) {
                if (texts.contains(text)) {
                    return text;
                } else {
                    texts.add(text);
                }
            }
            return words;
        }
        return null;
    }
}
