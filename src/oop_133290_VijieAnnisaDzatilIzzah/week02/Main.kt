package oop_133290_VijieAnnisaDzatilIzzah.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("---APLIKASI PMB UMN---")

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan NIM (Wajib 5 karakter): ")
    val nim = scanner.next()


    if (nim.length != 5) {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
        return
    }
    scanner.nextLine()

    print("Masukkan Jurusan: ")
    val major = scanner.nextLine()

    print("Pilih Jalur (1. Reguler, 2. Umum): ")
    val type = scanner.nextInt()

    if (type == 1) {

        val s1 = Student(name, nim, major)
        println("Terdaftar di: ${s1.major} dengan GPA awal ${s1.gpa}")

    } else if (type == 2) {

        val s2 = Student(name, nim)
        println("Terdaftar di: ${s2.major} dengan GPA awal ${s2.gpa}")

    } else {
        println("Pilihan ngawur, pendaftaran batal!")
    }

    scanner.close()
}

