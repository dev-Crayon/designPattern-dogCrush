package observer;

public class FuelDashboard implements CarObserver {
    private MyBentz car;
    private int fuel;

    public FuelDashboard(MyBentz car) {
        this.car = car;
        car.registerObserver(this);
    }

//    @Override
//    public void update(CarState carState) {
//        this.fuel = carState.fuel;
//        System.out.println("fuel: " + fuel);
//    }

    @Override
    public void update() {
        this.fuel = car.getCarState().fuel;
        System.out.println("fuel: " + fuel);
    }
}
