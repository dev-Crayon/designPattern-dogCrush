package decorator;

public class BasicCar implements Car {

    @Override
    public String getDescription() {
        return "이 자동차는 잘 굴러갑니다.";
    }

    @Override
    public double getPrice() {
        return 10000.0;
    }
}
