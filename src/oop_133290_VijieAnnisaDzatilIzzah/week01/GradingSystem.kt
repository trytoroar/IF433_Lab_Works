package oop_133290_VijieAnnisaDzatilIzzah.week01

fun main() {
    val name = "John Thor"
    val score = 80

    val grade = when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }

    println("Status: ${calculateStatus(score)}")

    val studentId: String? = null
    val idLength = studentId?.length ?: 0

    println("Panjang ID: $idLength")
    println("Grade kamu: $grade")
}

fun calculateStatus(score: Int) =
    if (score > 75) "Lulus" else "Tidak Lulus"
