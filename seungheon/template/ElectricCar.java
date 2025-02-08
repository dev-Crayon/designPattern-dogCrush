class ElectricCar extends Car {
    @Override
    protected void drive() {
        System.out.println("전기차를 부드럽게 운전합니다.");
    }

    @Override
    protected boolean needWashing() {
        return false;  // 전기차는 세차하지 말자;;
    }
}
