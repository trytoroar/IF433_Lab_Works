package oop_133290_VijieAnnisaDzatilIzzah.week14
import java.io.File

class BadOrderProcessor {
    private val file = File("orders.csv")

    fun processOrder(itemName: String, basePrice: Double, customerType: String) {

        val finalPrice = when (customerType) {
            "REGULAR" -> basePrice
            "VIP" -> basePrice * 0.90
            else -> basePrice
        }

        println("Memproses pesanan $itemName seharga $finalPrice")

        file.appendText("$itemName,$finalPrice,$customerType\n")

        println("Email terkirim: Pesanan $itemName Anda telah dikonfirmasi!")
    }
}

interface OrderRepository {
    fun saveOrder(itemName: String, finalPrice: Double, customerType: String)
}

class CsvOrderRepository(private val filePath: String = "orders.csv") : OrderRepository {
    override fun saveOrder(itemName: String, finalPrice: Double, customerType: String) {
        File(filePath).bufferedWriter().use { writer ->
            writer.appendLine("$itemName,$finalPrice,$customerType")
        }
    }
}

interface NotificationService {
    fun sendNotification(itemName: String, finalPrice: Double)
}

// ── Implementasi: notifikasi via email (simulasi ke konsol) ────────────────
class EmailNotifier : NotificationService {
    override fun sendNotification(itemName: String, finalPrice: Double) {
        println("Email terkirim: Pesanan $itemName seharga $finalPrice telah dikonfirmasi!")
    }
}

class SafeOrderProcessor(
    val repo: OrderRepository,
    val notifier: NotificationService
) {
    fun processOrder(itemName: String, basePrice: Double, customerType: String) {
        val finalPrice = when (customerType) {
            "VIP" -> basePrice * 0.90
            else  -> basePrice
        }

        println("Memproses pesanan $itemName seharga $finalPrice")
        repo.saveOrder(itemName, finalPrice, customerType)
        notifier.sendNotification(itemName, finalPrice)
    }
}