package oop_133290_VijieAnnisaDzatilIzzah.week10

data class Coin(override val name: String, val balance: Double) : HasName

data class Transaction(
    val id: String,
    val amount: Double
) : HasName {
    override val name: String
        get() = id
}