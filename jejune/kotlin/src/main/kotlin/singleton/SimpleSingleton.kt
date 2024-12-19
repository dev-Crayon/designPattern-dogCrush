package singleton

// 1. object 선언 - 가장 간단하고 스레드 세이프한 방법
object SimpleSingleton {
    val name = "Simple Singleton"

    fun doSomething() {
        println("Doing something in $name")
    }
}