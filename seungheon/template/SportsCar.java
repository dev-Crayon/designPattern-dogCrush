class SportsCar extends Car {
    @Override
    protected void drive() {
        System.out.println("스포츠카를 고속으로 운전합니다!");
    }

    @Override
    protected void washCar() {
        System.out.println("스포츠카를 전용 왁스로 세차합니다.");
    }
}
