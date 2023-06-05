package src

import java.lang.Runtime.Version

// Variabel Constant yang bisa di akses secara global
const val APP = "BELAJAR KOTLIN"
const val VERSION = "1.0.4.6"
fun main() {
    println("Selamat Datang di Aplikasi ${APP} Versi ${VERSION}")
    var fullName = "Juliansa" // mutabel bisa di ubah
    val umurAnda = 18 // imutabel tidak bisa di ubah

    println(fullName)
    println(umurAnda)
    // nullabel
    var firstName: String? = "yansa"
    firstName = null

    println(firstName)


}