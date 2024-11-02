package decorator;

public class SunRoof extends CarDecorator {
    public SunRoof(Car optionedCar) {
        super(optionedCar);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print(" + 썬 루프 기능");
    }
}
