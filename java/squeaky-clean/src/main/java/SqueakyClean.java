import java.util.regex.Pattern;

class SqueakyClean {

    private static final String REGEX_POSTFIX_CONTROL = "\\p{Cc}";
    private static final String REGEX_STANDARD_CHARS = "[^\\p{L}\\p{P}\\p{Z}]";
    private static final String REGEX_GREEK = "[α-ω]";

    static String clean(String identifier) {

        //Replace any spaces encountered with underscores
        String cleanIdentifier = identifier.replaceAll(" ", "_");

        //Replace control characters with the upper case string "CTRL"
        cleanIdentifier = cleanIdentifier.replaceAll(REGEX_POSTFIX_CONTROL, "CTRL");

        //Convert kebab-case to camelCase
        cleanIdentifier = Pattern.compile("-(.)")
                .matcher(cleanIdentifier)
                .replaceAll(mr -> mr.group(1).toUpperCase());

        //Omit characters that are not letters
        cleanIdentifier = cleanIdentifier.replaceAll(REGEX_STANDARD_CHARS, "");

        //Omit Greek lower case letters
        cleanIdentifier = cleanIdentifier.replaceAll(REGEX_GREEK, "");

        return cleanIdentifier;
    }
}
