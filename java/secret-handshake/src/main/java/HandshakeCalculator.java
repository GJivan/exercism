import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        String binary = Integer.toBinaryString(number);
        List<Signal> signals = new ArrayList<>();

        if ("1".equals(binary.substring(binary.length()-1)))
            signals.add(Signal.WINK);

        if (binary.length() >= 2
                && "1".equals(binary.substring(binary.length()-2,binary.length()-1)))
            signals.add(Signal.DOUBLE_BLINK);

        if (binary.length() >= 3
                && "1".equals(binary.substring(binary.length()-3,binary.length()-2)))
            signals.add(Signal.CLOSE_YOUR_EYES);

        if (binary.length() >= 4
                && "1".equals(binary.substring(binary.length()-4,binary.length()-3)))
            signals.add(Signal.JUMP);

        if (binary.length() >= 5
                && "1".equals(binary.substring(binary.length()-5,binary.length()-4)))
            Collections.reverse(signals);


        return signals;
    }

}
