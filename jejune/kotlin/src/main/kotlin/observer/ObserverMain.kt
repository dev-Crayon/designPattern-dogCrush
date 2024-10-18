package observer

fun main() {
    val avante = Car(
        carModel = CarModel.AVANTE,
        currentState = CarState(
            fuelLevel = 100.0,
            engineTemperature = 75.0,
            speed = 0.0,
            tirePressure = 30.0
        )
    )

    val sonata = Car(
        carModel = CarModel.SONATA,
        currentState = CarState(
            fuelLevel = 150.0,
            engineTemperature = 80.0,
            speed = 0.0,
            tirePressure = 35.0
        )
    )

    val grandeur = Car(
        carModel = CarModel.GRANDEUR,
        currentState = CarState(
            fuelLevel = 200.0,
            engineTemperature = 100.0,
            speed = 0.0,
            tirePressure = 40.0
        )
    )

    // 각 차의 정보 출력
    println("=== 소나타 정보 ===")
    println(sonata.getModelInfo())
    println("\n=== 그랜저 정보 ===")
    println(grandeur.getModelInfo())
    println("\n=== 아반떼 정보 ===")
    println(avante.getModelInfo())

    println("\n=== 소나타 모니터링 테스트 ===")
    // 소나타에 옵저버 등록
    sonata.apply {
        registerObserver(FuelMonitor())
        registerObserver(EngineMonitor())
        registerObserver(SpeedMonitor())
        registerObserver(TirePressureMonitor())

        // 상태 변경 테스트
        updateTirePressure(10.0)  // 연료 부족 경고
        updateSpeed(190.0)     // 과속 경고

        // 변경된 상태 출력
        println("\n=== 소나타 변경 모니터링 ===")
        println(getModelInfo())
    }

    println("\n=== 그랜저 모니터링 테스트 ===")
    // 그랜저에 옵저버 등록
    grandeur.apply {
        registerObserver(FuelMonitor())
        registerObserver(EngineMonitor())
        registerObserver(SpeedMonitor())
        registerObserver(TirePressureMonitor())

        // 상태 변경 테스트
        updateEngineTemperature(110.0)  // 엔진 과열 경고
        updateSpeed(210.0)              // 과속 경고
        // 변경된 상태 출력
        println("\n=== 그랜저 변경 모니터링 ===")
        println(getModelInfo())
    }

    println("\n=== 아반떼 모니터링 테스트 ===")
    // 아반떼에 옵저버 등록
    avante.apply {
        registerObserver(FuelMonitor())
        registerObserver(EngineMonitor())
        registerObserver(SpeedMonitor())
        registerObserver(TirePressureMonitor())

        // 상태 변경 테스트
        updateFuelLevel(10.0)  // 연료 부족 경고
        updateTirePressure(25.0)  // 타이어 공기압 경고

        // 변경된 상태 출력
        println("\n=== 아반떼 변경 모니터링 ===")
        println(getModelInfo())
    }
}