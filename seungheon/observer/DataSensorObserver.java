package observer;

public interface DataSensorObserver {

    /*
        주제를 구독하는 옵저버들은 해당 메서드를 구현해서 변경사항을 전달받는다.
        변경사항은 update 메서드의 인자로 전달됩니다.
    */
    void update();
}
