package observer

/**
 *
 * 자동차의 상태를 관리하는 옵저버 인터페이스
 */
interface CarStateObserver {
    val monitoringStateType: CarStateType  // 모니터링하는 상태 유형
    fun update(carState: CarState)
}