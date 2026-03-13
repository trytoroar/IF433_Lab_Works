package oop_133290_VijieAnnisaDzatilIzzah.week06

interface Camera {
    fun turnOn() {
        println("Lensa kamera terbuka dan sensor aktif.")
    }

    interface Phone {
        fun turnOn() {
            println("Sinyal seluler mencari jaringan.")
        }
    }
}