data class Dress(
    var color: String,
    var type: String
){

    fun describeDress(): String {
        return "Dress color is: $color, type is $type"
    }

}