import java.util.Collections;
import java.util.List;


public class TestTrack {

    public static void race(RemoteControlCar car) {
        car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(List<ProductionRemoteControlCar>
                                                                         carList) {
        Collections.sort(carList);
        return carList;
    }
}
