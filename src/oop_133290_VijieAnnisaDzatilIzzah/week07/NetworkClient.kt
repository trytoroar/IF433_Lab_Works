package oop_133290_VijieAnnisaDzatilIzzah.week07

class NetworkClient private constructor(val url: String) {
    fun connect() {
        println("Connecting to $url...")
    }
}