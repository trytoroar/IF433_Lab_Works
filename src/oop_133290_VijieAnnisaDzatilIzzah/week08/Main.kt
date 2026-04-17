package oop_133290_VijieAnnisaDzatilIzzah.week08

fun main() {
    println("=== TEST SAFE CALLS & ELVIS ===")
    val emptyOrder = Order( null)

    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota Tidak Diketahui"
    println("Tujuan pengiriman: $destination")
}