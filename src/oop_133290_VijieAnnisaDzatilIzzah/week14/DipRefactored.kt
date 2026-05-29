package oop_133290_VijieAnnisaDzatilIzzah.week14

interface Database {
    fun query(sql: String): List<String>
}

class PostgresDatabase : Database {
    override fun query(sql: String) = listOf("pg_data1", "pg_data2")
}

class SafeUserService(private val database: Database) {
    fun getUser(id: Int) = database.query("SELECT * FROM users WHERE id=$id")
}