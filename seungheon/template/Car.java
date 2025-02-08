abstract class Car {
    
    // 템플릿 메소드
    public final void driveCar() {
        startCar();
        drive();
        stopCar();
        if (needWashing()) {
            washCar();
        }
    }

    // 공통된 메소드
    protected void startCar() {
        System.out.println("자동차 시동을 겁니다.");
    }

    protected void stopCar() {
        System.out.println("자동차 시동을 끕니다.");
    }

    // 추상 메소드 (각 자동차가 구현해야 하는 메소드)
    protected abstract void drive();

    // hook
    protected boolean needWashing() {
        return true;  // 기본적으로 세차 필요
    }

    protected void washCar() {
        System.out.println("자동차를 세차합니다.");
    }
}
