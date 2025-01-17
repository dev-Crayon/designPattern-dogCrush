class CServiceProductService {
    fun getCServiceProduct(id: Long): CServiceProduct {
        return CServiceProduct(
            id = 2L,
            name = "C Service Product",
            review = 5,
        )
    }
}