public class ExperimentalRemoteControlCar implements RemoteControlCar {

  private static final int UNITS_DRIVEN = 20;
  private int distanceDriven = 0;

  public void drive() {
    distanceDriven += UNITS_DRIVEN;
  }

  public int getDistanceTravelled() {
    return distanceDriven;
  }
}
