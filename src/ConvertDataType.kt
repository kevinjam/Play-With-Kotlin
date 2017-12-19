/**
 * Created by kevinjanvier on 21/09/2017.
 */
fun main(args:Array<String>){

    var n1:Int=10
    var n2:Int?
    var n3:String ="20"
    n1=n3.toInt()

    println(n1)

    var xpi:Double =2.16
    var xpiInt :Int = xpi.toInt()

    println("----- " + xpiInt)


    val numb = "1000.0"
    val amount : Long = numb.toDouble().toLong()
    println("amonnn $" +amount.toString())



}

fun String.takeInt() : Int {
    val str = takeWhile { it.isDigit() }
    return if (str.isEmpty()) 0 else str.toInt()
}