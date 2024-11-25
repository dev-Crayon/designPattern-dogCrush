package factory.factoryMethod

abstract class Car(
    private val brand: String,
    private val model: String
) {
    fun assembleCar() {
        println("$brand $model 조립 중...")
    }

    fun testCar() {
        println("$brand $model 품질 테스트 중...")
    }
}

class BenzCar(model: String) : Car("Benz", model)

class AudiCar(model: String) : Car("Audi", model)