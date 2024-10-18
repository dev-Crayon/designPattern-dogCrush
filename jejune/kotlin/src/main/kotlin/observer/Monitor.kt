package observer

class FuelMonitor : CarStateObserver {
    override val monitoringStateType = CarStateType.FUEL

    override fun update(carState: CarState) {
        if (carState.fuelLevel < 20.0) {
            println("⚠️ 연료 부족 경고! 현재 연료량: ${carState.fuelLevel}%")
        }
    }
}

class EngineMonitor : CarStateObserver {
    override val monitoringStateType = CarStateType.ENGINE_TEMP

    override fun update(carState: CarState) {
        if (carState.engineTemperature > 100.0) {
            println("🔥 엔진 과열 경고! 현재 온도: ${carState.engineTemperature}°C")
        }
    }
}

class SpeedMonitor : CarStateObserver {
    override val monitoringStateType = CarStateType.SPEED

    override fun update(carState: CarState) {
        if (carState.speed > 180.0) {
            println("🚨 과속 경고! 현재 속도: ${carState.speed}km/h")
        }
    }
}

class TirePressureMonitor : CarStateObserver {
    override val monitoringStateType = CarStateType.TIRE_PRESSURE

    override fun update(carState: CarState) {
        if (carState.tirePressure < 28.0 || carState.tirePressure > 35.0) {
            println("🛞 타이어 공기압 경고! 현재 공기압: ${carState.tirePressure}psi")
        }
    }
}