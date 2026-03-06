package oop_133290_VijieAnnisaDzatilIzzah.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}