package decorator;

public class HeadUpDisplay extends CarDecorator {
    public HeadUpDisplay(Car optionedCar) {
        super(optionedCar);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print(" + 헤드업 디스플레이 기능");
    }
}
