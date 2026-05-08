package oop_133290_VijieAnnisaDzatilIzzah.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 2.5))
    coinRepo.add(Coin("ETH", 10.0))
    coinRepo.add(Coin("USDT", 1500.0))

    val response = ApiResponse(
        "200 OK",
        coinRepo.getAll()
    )
    println(response)

    println("Status Response: ${response.status}")

    response.data.forEach { coin ->
        println("Coin: ${coin.name}, Balance: ${coin.balance}")
    }

    val txRepo = WalletRepository<Transaction>()

    txRepo.add(Transaction("TX001", 50000.0))
    txRepo.add(Transaction("TX002", 125000.0))
    txRepo.add(Transaction("TX003", 75000.0))

    // sudah di test benar
}