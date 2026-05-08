package oop_133290_VijieAnnisaDzatilIzzah.week10

data class ApiResponse<T>(
    val status: String,
    val data: T
)