package oop_133290_VijieAnnisaDzatilIzzah.week04

open class Vehicle(val brand: String) {

    open fun honk() {
        println("Kendaraan $brand berbunyi.")
    }

    open fun accelerate() {
        println("$brand mulai bergerak.")
    }
}