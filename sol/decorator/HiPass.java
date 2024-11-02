package decorator;

public class HiPass extends CarDecorator {
    public HiPass(Car optionedCar) {
        super(optionedCar);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print(" + 하이패스 기능");
    }
}
