package observer;

import java.util.ArrayList;
import java.util.List;

// 주제를 구현한 클래스
public class MyBentz implements Car {
    private List<CarObserver> observerList = new ArrayList<>();
    CarState carState = new CarState(0, 100, 90);

    @Override
    public void registerObserver(CarObserver observer) {
        observerList.add(observer); // 옵저버 리스트에 등록
    }

    @Override
    public void removeObserver(CarObserver observer) {
        observerList.remove(observer);
    }

    // 풀 방식
    @Override
    public void notifyObservers() {
        observerList.forEach(x -> {
            x.update(); // 업데이트 주체가 옵저버 - 풀방식 1
        });
    }

    // 푸시 방식
//    @Override
//    public void notifyObservers() {
//        observerList.forEach(x -> {
//            x.update(carState); // 업데이트를 날림 - 푸시 방식
//        });
//    }

    public void changeState(Integer speed, Integer fuel, Integer temperature) {
        this.carState = new CarState(speed, fuel, temperature); // 상태를 바꾼 뒤
        notifyObservers(); // 다시 옵저버들에게 전달
    }

    // 풀 방식 - subject 구현체에 getter 두기
    public CarState getCarState() {
        return carState;
    }
}
