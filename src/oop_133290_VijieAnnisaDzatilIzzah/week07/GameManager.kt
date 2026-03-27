package oop_133290_VijieAnnisaDzatilIzzah.week07

object GameManager {
    var isGameRunning: Boolean = false

    fun startGame() {
        if (!isGameRunning) {
            isGameRunning = true
            println("Memulai Game Engine...")
        } else {
            println("Game sudah berjalan! Mencegah instansiasi ganda.")
        }
    }
}