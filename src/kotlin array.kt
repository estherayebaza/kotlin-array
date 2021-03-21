import java.util.*

fun main() {
schoolNames()
    popularcities()
    numbers()
    val namesArray= arrayOf("esther","phionah","sincere")
    println(Arrays.toString((namesArray)))
}
fun schoolNames() {
    var schoolNames = arrayOf("Progressive", "Brainstorm", "Bright", "AkiraChix")
    println(Arrays.toString(schoolNames))
}
fun popularcities() {
    var cities = arrayOf("harare", "mumbai", "dodoma", "jakarta")

    cities.forEach { cities ->
        println(cities.capitalize())
    }
}
fun numbers() {
    var numbers = arrayOf(32, 17, 4, 213, 78, 43, 90, 31, 3, 73, 11, 158, 62)
    var total = numbers[1] + numbers[4]
    println(total)
    var index = numbers.indexOf(158)
    println(index)
    var num = numbers.sortedArray()
    num.forEach {number -> println(number)}


    fun names(name1: String, name2: String, name3: String): Array<String> {
        val namesArray = arrayOf(name1, name2, name3)
        return namesArray
    }
}