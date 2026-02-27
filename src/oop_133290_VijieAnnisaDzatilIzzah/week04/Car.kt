package oop_133290_VijieAnnisaDzatilIzzah.week04

open class Car(brand: String, val numberOfDoors: Int) : Vehicles(brand)  {
    fun openTrunk() {
        println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka.")
    }
}