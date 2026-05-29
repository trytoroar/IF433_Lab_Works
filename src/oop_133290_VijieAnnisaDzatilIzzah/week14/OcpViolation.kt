package oop_133290_VijieAnnisaDzatilIzzah.week14

class DiscountCalculator {
    fun calculate(price: Double, type: String): Double {
        return when (type) {
            "student" -> price * 0.80
            "member" -> price * 0.70
            "employee" -> price * 0.90
            // ketika ada diskon baru: ubah class ini
            else -> price
        }
    }
}