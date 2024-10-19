package observer

/**
 * 자동차의 상태를 관리하는 클래스
 * @property fuelLevel 연료량
 * @property engineTemperature 엔진 온도
 * @property speed 속도
 * @property tirePressure 타이어 압력
 */
data class CarState(
    val fuelLevel: Double,
    val engineTemperature: Double,
    val speed: Double,
    val tirePressure: Double
)