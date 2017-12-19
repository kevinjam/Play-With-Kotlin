import com.sun.tools.doclint.DocLint

/**
 * Created by kevinjanvier on 21/09/2017.
 */

fun main(args: Array<String>){

    println("-----Math Calculator ------")
    println("Enter Number 1 :")
    var n1:Float = readLine()!!.toFloat()
    println("Enter Number 2 :")

    var n2 :Float = readLine()!!.toFloat()

    var sum:Float?
    sum = n1+n2

    println("Total $sum")
}