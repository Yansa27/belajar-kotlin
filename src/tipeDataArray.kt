package src

fun main() {
    val members: Array<String> = arrayOf("Eko" , "Joko" , "Budi")
    val values: Array<Byte> = arrayOf(100 , 90 , 95)
    val balances: Array<Int> = arrayOf(10_000 , 20_000, 30_000)

    println(members)
    println(values)
    println(balances)

    /* Operasi Array
    * size > Untuk mendapatkan panjang Array
    * get(index) > Mendapat data di posisi index
    * [index] > mendapat data di posisi index
    *  set(index , value) mengubah data di posisi index
    * [index] = value > mengubah data di posisi index
    */

    println(members.size)
    println(values.get(0))
    println(balances[1])
}