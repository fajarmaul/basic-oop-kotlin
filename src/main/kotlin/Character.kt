import uniforms.Uniform

data class Character(
    var name: String,
    var age: Int,
    var uniform1: Seifuku,
    var uniform2: Dress,
    var uniform3: Uniform
){

    fun getCharacterDescription(): String{
        val hasil = "Nama karakter: $name, age: $age"
        val hasilSeifuku = uniform1.describeSeifuku()
        val hasilDress = uniform2.describeDress()

        val hasilAkhir = hasil + "\n" + hasilSeifuku + "\n" + hasilDress
        return hasilAkhir
    }

}