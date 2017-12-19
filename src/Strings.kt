/**
 * Created by kevinjanvier on 11/12/2017.
 */
fun main(args: Array<String>) {

    val str = "May the Lord be with you"
    println(str)

//    val str1 ="My dad said the \rfunniest thing he said\nA joke\""
//    println(str1)
//
    val rawCral =""" A long time ago,
        in a Falaxy.
        far , far , far, far
        BUMM,BUMM,BUMM,BUMM""".trimMargin()

    println(rawCral)

//    for (char in str){
//        println(char)
//    }

    //Comparison
    val contentEquals = str.contentEquals("May the Lord be with you")
    println(contentEquals)

    val contains = str.contains("lord", true)
    println(contains)
}