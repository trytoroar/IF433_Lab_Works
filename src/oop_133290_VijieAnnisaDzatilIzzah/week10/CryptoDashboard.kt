package oop_133290_VijieAnnisaDzatilIzzah.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 2.5))
    coinRepo.add(Coin("ETH", 10.0))
    coinRepo.add(Coin("USDT", 1500.0))
}