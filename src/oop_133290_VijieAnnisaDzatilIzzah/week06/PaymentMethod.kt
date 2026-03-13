package oop_133290_VijieAnnisaDzatilIzzah.week06

interface PaymentMethod {
    fun pay(amount: Double)
}

class Gopay : PaymentMethod {
    override fun pay(amount: Double) {
        println("Processing Rp$amount via Gopay Server")
    }
}

class CreditCard : PaymentMethod {
    override fun pay(amount: Double) {
        println("Contacting Bank fot Rp$amount")
    }
}