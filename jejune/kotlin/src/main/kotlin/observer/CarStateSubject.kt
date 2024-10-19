package observer

/**
 * 자동차의 주제를 관리하는 인터페이스
 */
interface CarStateSubject {
    fun registerObserver(observer: CarStateObserver)
    fun removeObserver(observer: CarStateObserver)
    fun notifyObservers(stateType: CarStateType)
}