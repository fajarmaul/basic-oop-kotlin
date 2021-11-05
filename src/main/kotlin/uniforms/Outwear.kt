package uniforms

class Outwear(val color: String, val zippable: Boolean) : Uniform {

    override fun getUniform(): String {
        var output = "Uniform used is $color Outwear and it is" + if (zippable) " zippable" else " not zippable"
        return output
    }

}