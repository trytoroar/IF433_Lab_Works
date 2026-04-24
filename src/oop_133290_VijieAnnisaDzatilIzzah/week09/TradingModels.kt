package oop_133290_VijieAnnisaDzatilIzzah.week09

data class TradeLog(
    val pair: String,
    val position: String,
    val leverage: Int,
    val roe: Double,
    val status: String
)

fun main() {

    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 10, 12.5, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 15, -5.2, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 20, 8.0, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -3.5, "OPEN"),
        TradeLog("BTCUSDT", "LONG", 5, -1.0, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 25, 15.3, "CLOSED")
    )

    println("=== TRADE HISTORY ===")
    tradeHistory.forEach { println(it) }

    val closedTrades = tradeHistory
        .filter { it.status == "CLOSED" }

    println("\n=== CLOSED TRADES ===")
    closedTrades.forEach { println(it) }

    val winningTrades = closedTrades
        .filter { it.roe > 0 }

    println("\n=== WINNING TRADES ===")
    winningTrades.forEach { println(it) }

    val losingTrades = closedTrades
        .filter { it.roe <= 0 }

    println("\n=== LOSING TRADES ===")
    losingTrades.forEach { println(it) }

    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map { trade ->
            "WIN [${trade.pair} - ${trade.position}]: +${trade.roe}% ROE (Lev: ${trade.leverage}x)"
        }

    println("\n=== TOP PERFORMERS ===")
    topPerformersString.forEach { println(it) }

    val worstPerformersString = losingTrades
        .sortedBy { it.roe }
        .map { trade ->
            "LOSS [${trade.pair} - ${trade.position}]: ${trade.roe}% ROE (Lev: ${trade.leverage}x)"
        }

    println("\n=== WORST PERFORMERS ===")
    worstPerformersString.forEach { println(it) }

    val uniquePairs = tradeHistory
        .map { it.pair }
        .toSet()

    println("\n=== UNIQUE PAIRS ===")
    println(uniquePairs)

}