package factory.abstractFactory

interface Engine {
    fun assemble()
}

class BenzEngine : Engine {
    override fun assemble() {
        println("벤츠 엔진 조립 중...")
    }
}

class AudiEngine : Engine {
    override fun assemble() {
        println("아우디 엔진 조립 중...")
    }
}