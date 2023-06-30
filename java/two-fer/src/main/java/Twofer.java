import java.util.Optional;

public class Twofer {
    public String twofer(String name) {
        String otherPerson = Optional.ofNullable(name).orElse("you");
        return "One for " + otherPerson + ", one for me.";
    }
}
