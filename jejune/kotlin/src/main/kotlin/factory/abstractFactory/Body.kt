package factory.abstractFactory

interface Body {
    fun create()
}

class BenzBody : Body {
    override fun create() {
        println("벤츠 차체 제작 중...")
    }
}

class AudiBody : Body {
    override fun create() {
        println("아우디 차체 제작 중...")
    }
}