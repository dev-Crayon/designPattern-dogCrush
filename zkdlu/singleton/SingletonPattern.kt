object FactoryManager {
    val list = ArrayList<() -> Unit>()

    fun addTask(task: () -> Unit) {
        list.add(task)
    }

    fun hasTask(): Boolean {
        return list.isNotEmpty()
    }

    fun runTask() {
        val task = list.random()
        list.remove(task)
        task()
    }
}

class CarFactory(
    val name: String,
) {

    fun motor() {
        println("$name - 모터를 만듭니다")
    }

    fun wheel() {
        println("$name - 바퀴를 만듭니다")
    }

    fun body() {
        println("$name - 차체를 만듭니다")
    }
}


fun main() {

    val factory1 = CarFactory("1번")
    val factory2 = CarFactory("2번")

    FactoryManager.addTask { factory1.motor() }
    FactoryManager.addTask { factory1.wheel() }
    FactoryManager.addTask { factory1.body() }
    FactoryManager.addTask { factory2.motor() }
    FactoryManager.addTask { factory2.wheel() }
    FactoryManager.addTask { factory2.body() }

    while (FactoryManager.hasTask()) {
        FactoryManager.runTask()
    }
}