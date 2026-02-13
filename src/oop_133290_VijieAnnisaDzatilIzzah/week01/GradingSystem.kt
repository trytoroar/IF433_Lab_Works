package oop_133290_VijieAnnisaDzatilIzzah.week01

fun main() {
    val grade = when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }

    println("Grade kamu: $grade")
}