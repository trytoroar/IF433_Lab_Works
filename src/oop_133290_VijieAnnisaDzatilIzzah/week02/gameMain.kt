package oop_133290_VijieAnnisaDzatilIzzah.week02

fun main() {

    val hero1 = Hero("Arthur", 25)
    val hero2 = Hero("Lancelot", 20)

    println("=== PERTARUNGAN DIMULAI ===")

    var turn = 1

    while (hero1.isAlive() && hero2.isAlive()) {

        println("\n-- Turn $turn --")

        hero1.attack(hero2.name)
        hero2.takeDamage(hero1.baseDamage)

        if (!hero2.isAlive()) break

        hero2.attack(hero1.name)
        hero1.takeDamage(hero2.baseDamage)

        turn++
    }

    println("\n=== PERTARUNGAN SELESAI ===")

    if (hero1.isAlive()) {
        println("${hero1.name} MENANG!")
    } else {
        println("${hero2.name} MENANG!")
    }
}
