interface Car {
    fun drive(): String
}

class Sedan : Car {
    override fun drive(): String {
        return "Sedan is driving."
    }
}

class SUV : Car {
    override fun drive(): String {
        return "SUV is driving."
    }
}

abstract class CarFactory {
    abstract fun createCar(): Car
}

class SedanFactory : CarFactory() {
    override fun createCar(): Car {
        return Sedan()
    }
}

class SUVFactory : CarFactory() {
    override fun createCar(): Car {
        return SUV()
    }
}

fun main() {
    val sedanFactory: CarFactory = SedanFactory()
    val sedan: Car = sedanFactory.createCar()
    println(sedan.drive())

    val suvFactory: CarFactory = SUVFactory()
    val suv: Car = suvFactory.createCar()
    println(suv.drive())
}