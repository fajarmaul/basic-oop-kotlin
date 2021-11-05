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

    val character1: Character = Character(
        name = "Hatsune Miku",
        age = 19,
        uniform1 = defaultUniform,
        uniform2 = summerUniform,
        uniform3 = outwear
    )

    //Printing stuff
    println("Your character is")

    println("Name: " + character1.name)
    println("Age: " + character1.age)

    println("==============================================")

    println("Is using winter type uniform? : " + character1.uniform1.isWinter)
    println("First uniform color is: " + character1.uniform1.color)

    println("==============================================")

    println("Second uniform is")
    println("Is using : " + character1.uniform2.type)
    println("Second uniform color is: " + character1.uniform2.color)

    println("==============================================")

    println("Third uniform is")
    println("Is using :" + character1.uniform3.getUniform())

}