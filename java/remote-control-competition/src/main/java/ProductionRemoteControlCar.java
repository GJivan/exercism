class ProductionRemoteControlCar implements RemoteControlCar,
        Comparable<ProductionRemoteControlCar> {

    private static final int UNITS_DRIVEN = 10;
    private int distanceDriven = 0;
    private int numberOfVictories;

    public void drive() {
        distanceDriven += UNITS_DRIVEN;
    }

    public int getDistanceTravelled() {
        return distanceDriven;
    }

    public int getNumberOfVictories() {
        return numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar compCar) {
        return Integer.compare(compCar.getNumberOfVictories(), getNumberOfVictories());
    }
}
