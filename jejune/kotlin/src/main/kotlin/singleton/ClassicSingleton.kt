package singleton

// 3. 클래식한 자바 스타일의 싱글톤
class ClassicSingleton private constructor() {
    private var data: String = ""

    companion object {
        @Volatile private var INSTANCE: ClassicSingleton? = null

        fun getInstance(): ClassicSingleton {
            return INSTANCE ?: synchronized(this) {
                INSTANCE ?: ClassicSingleton().also { INSTANCE = it }
            }
        }
    }

    fun setData(value: String) {
        data = value
    }

    fun getData(): String = data
}