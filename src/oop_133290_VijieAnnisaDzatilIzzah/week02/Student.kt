package oop_133508_ArdifaRizkySaputra.week02

class Student (
    val name: String,
    val nim: String,
    var gpa: Double = 0.0,
    var major: String
) {

    // Secondary Constructor (jalur umum tanpa jurusan)
    constructor(name: String, nim: String)
            : this(name, nim, 0.0, "Non-Matriculated") {
        println("LOG: Menggunakan constructor jalur umum (Tanpa Jurusan).")
    }

    // Init block
    init {
        if (nim.length != 6) {
            println("WARNING: Objek tercipta dengan NIM ($nim) yang tidak valid!")
            println("Data mahasiswa $name mungkin akan bermasalah di sistem.")
        } else {
            println("LOG: Objek Student $name berhasil dialokasikan di Memory.")
        }
    }
}
