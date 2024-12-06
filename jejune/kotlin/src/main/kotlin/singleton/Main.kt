package singleton

fun main() {
    // 1. object 선언 사용
    SimpleSingleton.doSomething()

    // 2. companion object 싱글톤 사용
    val companionSingleton = CompanionObjectSingleton.getInstance()
    companionSingleton.doSomething()

    // 3. 클래식 싱글톤 사용
    val classicSingleton = ClassicSingleton.getInstance()
    classicSingleton.setData("Hello Singleton!")
    println(classicSingleton.getData())
}