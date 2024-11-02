package decorator;

public class Main {
    public static void main(String[] args) {

        // 기본 자동차 생성
        Car myCar = new BasicCar();
        System.out.println(myCar.getDescription() + " 비용: " + myCar.getPrice() + "원");

        // 에어컨 추가
        myCar = new AirConditioner(myCar);
        System.out.println(myCar.getDescription() + " 비용: " + myCar.getPrice() + "원");

        // 가죽 시트 추가
        myCar = new LeatherSeats(myCar);
        System.out.println(myCar.getDescription() + " 비용: " + myCar.getPrice() + "원");
    }
}
