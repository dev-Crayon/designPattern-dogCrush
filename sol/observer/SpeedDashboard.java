package observer;

public class SpeedDashboard implements CarObserver {
    private MyBentz car; // 풀 방식 - 옵저버에서 주제를 알게됨
    private int speed;

    public SpeedDashboard(MyBentz car) {
        this.car = car;
        car.registerObserver(this); // 옵저버에서 주체 이든, 주체에서 옵저버이든 쌍방관계를 맺어줘야 함
    }

    @Override
    public void update() {
        this.speed = car.getCarState().speed;
        System.out.println("speed: " + speed);
    }


    // push
//    @Override
//    public void update(CarState carState) {
//        this.speed = carState.speed;
//        System.out.println("speed: " + speed);
//    }
}
