package decorator;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car myBentz = new MyBentz();
        // 기본 스펙 벤츠
        myBentz.assemble();
        System.out.println();

        Car mySonata = new MySonata();
        mySonata = new SunRoof(mySonata);
        mySonata = new HeadUpDisplay(mySonata);
        mySonata.assemble();

        // 이렇게 한번에도 가능. 순서를 맞춰 해야함
        Car myTusan = new HeadUpDisplay(new SunRoof(new MySonata()));

        // 서비스 로직에서 구현체로 로직을 짤 때에는 추상 요소에 추가가 필요함 (변경 필요)
        List<Car> cars = List.of(mySonata, myBentz);
        for (Car car : cars) {
            if (car instanceof SunRoof) {
                car.assemble("추가 옵션 : 2 doors");
            }
        }
    }
}
