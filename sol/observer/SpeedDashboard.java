package observer;

public class SpeedDashboard implements CarObserver {
    private int speed;

    @Override
    public void update(CarState carState) {
        this.speed = carState.speed;
        System.out.println("speed: " + speed);
    }
}
