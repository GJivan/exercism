import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        List<Signal> signals = new ArrayList<>();

        if ((number & 1) == 1) {
            signals.add(Signal.WINK);
        }

        if ((number & 2) == 2) {
            signals.add(Signal.DOUBLE_BLINK);
        }

        if ((number & 4) == 4) {
            signals.add(Signal.CLOSE_YOUR_EYES);
        }

        if ((number & 8) == 8) {
            signals.add(Signal.JUMP);
        }

        if ((number & 16) == 16) {
            Collections.reverse(signals);
        }


        return signals;
    }

}
