import java.lang.StringBuilder

fun main() {
val list= listOf("apple","banana","Orange","pear","grape")
    val result= with(StringBuilder()){
        append("Start eating fruits\n")
        for (fruit in list){
            append(fruit).append("\n")
        }
        append("Ate all fruits\n")
        toString()
    }
    println(result)

}