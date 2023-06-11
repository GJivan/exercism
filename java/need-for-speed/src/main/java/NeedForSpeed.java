class NeedForSpeed {

    private final int speed;
    private final int batteryDrain;
    private int drivenDistance = 0;
    private int battery = 100;

    public NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }

    public boolean batteryDrained() {
        return battery == 0;
    }

    public int distanceDriven() {
        return drivenDistance;
    }

    public void drive() {
        if (!batteryDrained()) {
            drivenDistance += speed;
            battery -= batteryDrain;
        }

    }
}

class RaceTrack {
    // TODO: define the constructor for the 'RaceTrack' class

    private final int trackLength;

    public RaceTrack(int trackLength) {
        this.trackLength = trackLength;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        while (!car.batteryDrained()) {
            car.drive();
        }

        return car.distanceDriven() >= trackLength;

    }
}
