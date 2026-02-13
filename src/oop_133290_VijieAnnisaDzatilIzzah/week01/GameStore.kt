package oop_133290_VijieAnnisaDzatilIzzah.week01

fun main() {

    val gameTitle: String = "Elden Ring"
    val price: Int = 750_000
    val discount = calculateDiscount(price)
    val finalPrice = price - discount

    println("Judul Game: $gameTitle")
    println("Harga Asli: Rp $price")
    println("Harga Akhir: Rp $finalPrice")
}

fun calculateDiscount(price: Int): Int =
    if (price > 500_000) {
        (price * 20) / 100
    } else {
        (price * 10) / 100
    }
