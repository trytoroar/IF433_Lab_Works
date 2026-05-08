package oop_133290_VijieAnnisaDzatilIzzah.week10

interface HasName {
    val name: String
}

class WalletRepository<T : HasName> {

    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    fun findByName(name: String): T? {
        return items.find { it.name == name }
    }
}