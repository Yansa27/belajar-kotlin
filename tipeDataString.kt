fun main() {
    var fullName: String = "juliansa"

    var address: String = """
        ini adallah 
        jalan belum jadi 
        rt 0101
        kabupaten muara enim 
        indonesia
    """.trimMargin()

    // Menggabungkan string
    var firstName : String= "Budi"
    var lastName  : String= "Santo"

    var fullNama : String = firstName + " " + lastName // not recomendation

    // String template
    var desc: String = "Nama lengkap = $fullNama char =${fullNama.length}" // recomendation
    println(desc)
    println(fullNama)
    println(fullName)
    println(address)

}