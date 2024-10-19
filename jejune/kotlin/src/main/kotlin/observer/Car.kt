package observer

class Car(
    private var carModel: CarModel,
    private var currentState: CarState
) : CarStateSubject {

    private val observers = mutableListOf<CarStateObserver>()

    override fun registerObserver(observer: CarStateObserver) {
        observers.add(observer)
    }

    override fun removeObserver(observer: CarStateObserver) {
        observers.remove(observer)
    }

    override fun notifyObservers(stateType: CarStateType) {
        observers.filter { it.monitoringStateType == stateType }
            .forEach { it.update(currentState) }
    }

    fun updateFuelLevel(newLevel: Double) {
        currentState = currentState.copy(fuelLevel = newLevel)
        notifyObservers(CarStateType.FUEL)
    }

    fun updateEngineTemperature(newTemp: Double) {
        currentState = currentState.copy(engineTemperature = newTemp)
        notifyObservers(CarStateType.ENGINE_TEMP)
    }

    fun updateSpeed(newSpeed: Double) {
        currentState = currentState.copy(speed = newSpeed)
        notifyObservers(CarStateType.SPEED)
    }

    fun updateTirePressure(newPressure: Double) {
        currentState = currentState.copy(tirePressure = newPressure)
        notifyObservers(CarStateType.TIRE_PRESSURE)
    }

    fun getModelInfo(): String {
        return """
            차종: $carModel
            연료 상태: ${currentState.fuelLevel}L
            엔진 온도: ${currentState.engineTemperature}도
            현재 속도: ${currentState.speed}km/h
            타이어 공기압: ${currentState.tirePressure}psi
        """.trimIndent()
    }
}