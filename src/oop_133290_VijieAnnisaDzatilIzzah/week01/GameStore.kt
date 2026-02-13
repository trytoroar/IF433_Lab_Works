package oop_133290_VijieAnnisaDzatilIzzah.week01

fun main() {

    val gameTitle: String = "Elden Ring"
    val price: Int = 750_000
    val discount = calculateDiscount(price)
    val finalPrice = price - discount

    printReceipt(
        title = gameTitle,
        finalPrice = finalPrice
    )
}

fun calculateDiscount(price: Int): Int =
    if (price > 500_000) {
        (price * 20) / 100
    } else {
        (price * 10) / 100
    }

fun printReceipt(title: String, finalPrice: Int) {
    println("---STRUK PEMBELIAN---")
    println("Judul Game : $title")
    println("Harga Bayar: Rp $finalPrice")
}