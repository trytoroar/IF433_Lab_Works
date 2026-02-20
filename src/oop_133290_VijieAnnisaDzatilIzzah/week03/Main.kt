package oop_133290_VijieAnnisaDzatilIzzah.week03

fun main () {
    val e = Employee ("Budi")

    // e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.increasePerformance()

    println("Pajak yang harus dibayar: ${e.tax}")

    val weapon = Weapon("Excalibur")

    weapon.damage = -50
    weapon.damage = 9999

    println("Damage akhir: ${weapon.damage}")
    println("Tier senjata: ${weapon.tier}")

    val player = Player("Deza")

    player.addXp(50)
    player.addXp(60)
}