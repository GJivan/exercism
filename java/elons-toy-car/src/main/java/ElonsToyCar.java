public class ElonsToyCar {

    private int metersDriven = 0;
    private int battery = 100;

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return String.format("Driven %d meters", metersDriven);
    }

    public String batteryDisplay() {
        return (battery > 0) ? "Battery at " + battery + "%" : "Battery empty";
    }

    public void drive() {
        if (battery >= 1) {
            metersDriven += 20;
            battery--;
        }

    }
}
