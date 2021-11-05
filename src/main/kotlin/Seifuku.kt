data class Seifuku(
    var color: String,
    var isWinter: Boolean
){

    fun describeSeifuku(): String {
        var result = "Color of seifuku is: $color, and isWinter is: $isWinter"
        return result
    }

}