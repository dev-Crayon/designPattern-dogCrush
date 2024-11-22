package factory.abstractFactory

interface CarPartsFactory {
    fun createEngine(): Engine
    fun createBody(): Body
}

class BenzPartsFactory : CarPartsFactory {
    override fun createEngine(): Engine = BenzEngine()
    override fun createBody(): Body = BenzBody()
}

class AudiPartsFactory : CarPartsFactory {
    override fun createEngine(): Engine = AudiEngine()
    override fun createBody(): Body = AudiBody()
}