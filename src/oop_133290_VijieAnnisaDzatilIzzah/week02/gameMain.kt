package oop_133290_VijieAnnisaDzatilIzzah.week02

import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)

    println("---GAME SEDERHANA---")

    // INPUT HERO
    print("Masukkan Nama Hero: ")
    val heroName = scanner.nextLine()

    print("Masukkan Base Damage Hero: ")
    val damage = scanner.nextInt()

    val hero = Hero(heroName, damage)

    var enemyHp = 100

    while (hero.isAlive() && enemyHp > 0) {

        println("\n1. Serang")
        println("2. Kabur")
        print("Pilih aksi: ")
        val choice = scanner.nextInt()

        if (choice == 1) {

            enemyHp -= hero.baseDamage
            if (enemyHp < 0) enemyHp = 0

            println("Sisa HP Musuh: $enemyHp")

            if (enemyHp > 0) {
                val enemyDamage = (10..20).random()
                println("Musuh menyerang balik dengan $enemyDamage damage!")
                hero.takeDamage(enemyDamage)
            }

        } else if (choice == 2) {
            println("${hero.name} kabur dari pertarungan!")
            break
        }
    }

    println("\n=== HASIL PERTARUNGAN ===")

    if (!hero.isAlive()) {
        println("Hero kalah!")
    } else if (enemyHp == 0) {
        println("Hero menang!")
    } else {
        println("Pertarungan selesai tanpa pemenang.")
    }

    scanner.close()
}
