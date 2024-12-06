package singleton

// 2. companion object - 클래스 내부에서 싱글톤 구현
class CompanionObjectSingleton private constructor() {
    companion object {
        @Volatile
        private var instance: CompanionObjectSingleton? = null

        fun getInstance(): CompanionObjectSingleton {
            return instance ?: synchronized(this) {
                instance ?: CompanionObjectSingleton().also { instance = it }
            }
        }
    }

    fun doSomething() {
        println("Doing something in CompanionObjectSingleton")
    }
}