
public class Hamming {

    private static String leftStrand = null;
    private static String rightStrand = null;

    public Hamming(String leftStrand, String rightStrand) {

        if (leftStrand.isBlank() &&  !rightStrand.isBlank())
            throw new IllegalArgumentException("left strand must not be empty.");
        if (rightStrand.isBlank() && !leftStrand.isBlank())
            throw new IllegalArgumentException("right strand must not be empty.");
        if (leftStrand.length() != rightStrand.length())
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
    }

    public int getHammingDistance() {

        int counter = 0;
        for(int i=0; i<leftStrand.length(); i++) {
            if(leftStrand.charAt(i) != rightStrand.charAt(i)) {
                counter++;
            }
        }
        return counter;

    }
}
