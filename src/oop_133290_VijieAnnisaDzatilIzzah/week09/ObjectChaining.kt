package oop_133290_VijieAnnisaDzatilIzzah.week09

data class Student(val name: String, val gpa: Double)

fun main() {
    val students = listOf(
        Student("Andi", 3.2),
        Student("Deza", 3.7),
        Student("Dipa", 3.8),
        Student("Tjho", 3.3)
    )

    println("=== HONOR STUDENTS PIPELINE ===")

    val honorNames = students
        .filter { it.gpa >= 3.5 }
        .sortedBy { it.name }
        .map { it.name.uppercase() }

    honorNames.forEach { println("Honor Roll: $it")}
}