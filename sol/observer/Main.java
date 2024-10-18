package observer;

public class Main {
    public static void main(String[] args) {
        // 풀 방식
        MyBentz car = new MyBentz();
        SpeedDashboard speedDashboard = new SpeedDashboard(car); // 옵저버에서 주제를 안다 (주제 - 옵저버 등록은 옵저버 내부에서)
        FuelDashboard fuelDashboard = new FuelDashboard(car);
        TemperatureDashboard temperatureDashboard = new TemperatureDashboard(car); // 해당 객체를 쓰려는 것보다는 내부의 연관관계를 맺어줌

        car.changeState(80, 23, 15);
        car.changeState(100, 12, 33);

        car.removeObserver(fuelDashboard);

        car.changeState(70, 15, 52);



        // 푸쉬 방식
//
//        MyBentz car = new MyBentz();
//
//        // observer
//        SpeedDashboard speedDashboard = new SpeedDashboard();
//        FuelDashboard fuelDashboard = new FuelDashboard();
//        TemperatureDashboard temperatureDashboard = new TemperatureDashboard();
//
//       // 옵저버로 등록
//        car.registerObserver(speedDashboard);
//        car.registerObserver(fuelDashboard);
//        car.registerObserver(temperatureDashboard);
//
//        // change status
//        car.changeState(80, 23, 15);
//        car.changeState(100, 12, 33);
//
//        // 옵저버 해제하면 안 나옴
//        car.removeObserver(fuelDashboard);
//        car.changeState(50, 30, 20);
    }
}
