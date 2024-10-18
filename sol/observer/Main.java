package observer;

public class Main {
    public static void main(String[] args) {
        MyBentz car = new MyBentz();

        // observer
        SpeedDashboard speedDashboard = new SpeedDashboard();
        FuelDashboard fuelDashboard = new FuelDashboard();
        TemperatureDashboard temperatureDashboard = new TemperatureDashboard();

       // 옵저버로 등록
        car.registerObserver(speedDashboard);
        car.registerObserver(fuelDashboard);
        car.registerObserver(temperatureDashboard);

        // change status
        car.changeState(80, 23, 15);
        car.changeState(100, 12, 33);

        // 옵저버 해제하면 안 나옴
        car.removeObserver(fuelDashboard);
        car.changeState(50, 30, 20);
    }
}
