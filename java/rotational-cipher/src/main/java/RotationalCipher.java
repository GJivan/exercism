import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class RotationalCipher {

    int shiftKey;
    RotationalCipher(int shiftKey) {
        this.shiftKey = shiftKey;
    }

    String rotate(String data) {

        StringBuilder result = new StringBuilder();
        for (char character : data.toCharArray()) {
            if (character != ' ' && Character.isLetter(character)) {
                int originalAlphabetPosition = Character.isUpperCase(character) ? character - 'A' : character - 'a';
                int newAlphabetPosition = (originalAlphabetPosition + shiftKey) % 26;
                char newCharacter = (char)  (Character.isUpperCase(character) ? ('A' + newAlphabetPosition) : ('a' + newAlphabetPosition) )   ;
                result.append(newCharacter);
            } else {
                result.append(character);
            }
        }
        return result.toString();

    }

}
