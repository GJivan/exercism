import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {

    private static LocalDateTime dateAfterGiga;

    public Gigasecond(LocalDate moment) {
        dateAfterGiga = addTime(moment.atStartOfDay());
    }

    public Gigasecond(LocalDateTime moment) {
        dateAfterGiga = addTime(moment);
    }

    private LocalDateTime addTime(LocalDateTime moment) {
        return moment.plusSeconds(1000000000);
    }

    public LocalDateTime getDateTime() {
        return dateAfterGiga;
    }
}
