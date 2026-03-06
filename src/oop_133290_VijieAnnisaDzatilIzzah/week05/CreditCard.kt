package oop_133290_VijieAnnisaDzatilIzzah.week05

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {

    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("Pembayaran sebesar $amount berhasil menggunakan Credit milik $accountName.")
            println("Total penggunaan kartu: $usedAmount dari limit $limit.")
        } else {
            println("Transaksi ditolak: melebihi limit kartu yang ditentukan.")
        }
    }
}