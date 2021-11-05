import uniforms.Outwear

fun main(args: Array<String>) {

    println("======================= Welcome to character creation =======================")

    val defaultUniform: Seifuku = Seifuku(
        color = "Blue",
        isWinter = false
    )

    val summerUniform: Dress = Dress(
        color = "White",
        type = "Short Dress"
    )

    val outwear = Outwear(
        color = "Blue",
        zippable = true
    )

    //Character creation
    val character1: Character = Character(
        name = "Hatsune Miku",
        age = 19,
        uniform1 = defaultUniform,
        uniform2 = summerUniform,
        uniform3 = outwear
    )

    //Printing stuff
    var hasil = character1.getCharacterDescription()
    println(hasil)

    println("=====================================================")

}