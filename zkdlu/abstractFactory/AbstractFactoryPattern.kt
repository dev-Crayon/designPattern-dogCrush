
interface Tire {
    fun bingleBingle()
}

class SimpleTire : Tire {
    override fun bingleBingle() {
        println("구른다")
    }
}

interface Engine {
    fun booroongBoorong()
}

class SimpleEngine : Engine {
    override fun booroongBoorong() {
        println("부릉부릉")
    }
}


interface CarFactory {
    fun makeTire(): Tire
    fun makeEngine(): Engine
}

class SimpleCarFactory : CarFactory {
    override fun makeTire(): Tire {
        return SimpleTire()
    }

    override fun makeEngine(): Engine {
        return SimpleEngine()
    }

}

abstract class Car(
    val engine: Engine,
    val tire: Tire,
) {
    fun drive() {
        engine.booroongBoorong()
        tire.bingleBingle()
        println("부릉부릉부르릉")
    }
}

class SimpleCar(carFactory: CarFactory) : Car(carFactory.makeEngine(), carFactory.makeTire())

fun main() {
    val car = SimpleCar(SimpleCarFactory())
    car.drive()
}