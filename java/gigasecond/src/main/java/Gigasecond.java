import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {

    private final LocalDateTime now;

    public Gigasecond(LocalDate moment) {
        this.now = moment.atStartOfDay();
    }

    public Gigasecond(LocalDateTime moment) {
        this.now = moment;
    }

    public LocalDateTime getDateTime() {
        return now.plusSeconds(1_000_000_000L);
    }
}
