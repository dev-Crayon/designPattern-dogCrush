package factory.factoryMethod

abstract class CarFactory {
    fun orderCar(model: String): Car {
        val car = createCar(model)
        car.assembleCar()
        car.testCar()
        return car
    }

    // 팩토리 메서드
    protected abstract fun createCar(model: String): Car
}

class BenzFactory : CarFactory() {
    override fun createCar(model: String): Car = BenzCar(model)
}

class AudiFactory : CarFactory() {
    override fun createCar(model: String): Car = AudiCar(model)
}