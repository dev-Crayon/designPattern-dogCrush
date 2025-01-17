interface Repository {
    fun get(): Int
}

class SimpleRepository : Repository {
    override fun get(): Int = 1
}

// 이미 훌륭한 어댑터
class CacheRepository(
    private val infra: CacheInfra,
    private val repository: Repository
) : Repository {
    override fun get(): Int {
        return infra.getFromCache() ?: repository.get().also { infra.saveToCache(it) }
    }
}

class CacheInfra(
    var value: Int? = null,
) {
    fun saveToCache(v: Int) {
        this.value = v
    }

    fun getFromCache(): Int? = value
}
