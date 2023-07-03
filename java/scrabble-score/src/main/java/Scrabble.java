import java.util.HashMap;
import java.util.Map;

class Scrabble {

    private final String word;

    private static final Map<Integer, Integer> lScore = new HashMap<>(26);

    static {
        // Initialize letter scores
        "AEIOULNRST".chars().forEach(c -> lScore.put(c, 1));
        "DG".chars().forEach(c -> lScore.put(c, 2));
        "BCMP".chars().forEach(c -> lScore.put(c, 3));
        "FHVWY".chars().forEach(c -> lScore.put(c, 4));
        "K".chars().forEach(c -> lScore.put(c, 5));
        "JX".chars().forEach(c -> lScore.put(c, 8));
        "QZ".chars().forEach(c -> lScore.put(c, 10));
    }

    Scrabble(String word) {
        this.word = word.toUpperCase();
    }

    int getScore() {
        return word.chars().reduce(0, (a, b) -> a + lScore.get(b));
    }

}
