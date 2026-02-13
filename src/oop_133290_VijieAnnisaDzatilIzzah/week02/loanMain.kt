package oop_133290_VijieAnnisaDzatilIzzah.week02

fun main() {

    val loan1 = Loan("Clean Code", "Vijie")
    println("Denda loan1: Rp ${loan1.calculateFine()}")

    val loan2 = Loan("Kotlin Programming", "Faathin", 5)
    println("Denda loan2: Rp ${loan2.calculateFine()}")
}
