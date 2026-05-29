package oop_133290_VijieAnnisaDzatilIzzah.week14

import java.io.FileWriter

interface OrderRepository {

    fun saveOrder(
        itemName: String,
        finalPrice: Double,
        customerType: String
    )
}

interface NotificationService {

    fun sendNotification(
        itemName: String,
        finalPrice: Double
    )
}

interface PricingStrategy {

    fun calculate(price: Double): Double
}

class CsvOrderRepository(
    private val filePath: String = "orders.csv"
) : OrderRepository {

    override fun saveOrder(
        itemName: String,
        finalPrice: Double,
        customerType: String
    ) {

        FileWriter(filePath, true)
            .buffered()
            .use { writer ->

                writer.appendLine(
                    "$itemName,$finalPrice,$customerType"
                )
            }
    }
}

class EmailNotifier : NotificationService {

    override fun sendNotification(
        itemName: String,
        finalPrice: Double
    ) {

        println(
            "Email terkirim: Pesanan $itemName seharga $finalPrice telah dikonfirmasi!"
        )
    }
}

class RegularPricing : PricingStrategy {

    override fun calculate(price: Double): Double {

        return price
    }
}

class VipPricing : PricingStrategy {

    override fun calculate(price: Double): Double {

        return price * 0.90
    }
}

class SafeOrderProcessor(

    private val repo: OrderRepository,
    private val notifier: NotificationService

) {

    fun processOrder(
        itemName: String,
        basePrice: Double,
        pricing: PricingStrategy
    ) {

        val finalPrice = pricing.calculate(basePrice)

        println(
            "Memproses pesanan $itemName seharga $finalPrice"
        )

        repo.saveOrder(
            itemName,
            finalPrice,
            pricing::class.simpleName ?: "UNKNOWN"
        )

        notifier.sendNotification(
            itemName,
            finalPrice
        )
    }
}

fun main() {

    val processor = SafeOrderProcessor(

        repo = CsvOrderRepository(),
        notifier = EmailNotifier()
    )

    processor.processOrder(
        "Sepatu Nike",
        500_000.0,
        RegularPricing()
    )

    processor.processOrder(
        "Tas Gucci",
        2_000_000.0,
        VipPricing()
    )
}