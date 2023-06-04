import java.lang.Character;
import java.util.regex.Pattern;

class SqueakyClean {

    private static final String REGEX_STANDARD_CHARS = "[^\\p{L}\\p{P}\\p{Z}]";

    static String clean(String identifier) {

        //Replace any spaces encountered with underscores
        String cleanIdentifier = identifier.replaceAll(" ","_");

        //Replace control characters with the upper case string "CTRL"
        cleanIdentifier = cleanIdentifier.replaceAll("\\p{Cc}", "CTRL");

        //Omit characters that are not letters
        cleanIdentifier = cleanIdentifier.replaceAll(REGEX_STANDARD_CHARS, "");

        cleanIdentifier = Pattern.compile("-(.)")
                .matcher(cleanIdentifier)
                .replaceAll(mr -> mr.group(1).toUpperCase());


        //Omit Greek lower case letters
        cleanIdentifier = cleanIdentifier.replaceAll("[α-ω]", "");

        return cleanIdentifier;
    }
}
