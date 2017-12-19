import java.util.*

/**
 * Created by kevin janvier on 21/09/2017.
 */
/**
 * Priority Rules in Kotlin
 */
fun main(args:Array<String>){
val index =0
    while (index < 3) {
        print("Enter Your Age : ")
        var age: Int = readLine()!!.toInt()
        agelimit(age)
    }
}




fun agelimit(age:Int){
    var year = Calendar.getInstance().get(Calendar.YEAR)
    if (age == 74){
        println("This Your Last Year Mr Presidential $year")}
    else if (age < 40)
    {
        println("You can't be a President ... You need to be 40 and above")}
    else if (age < 74){
        println("Congratulation !!!! You can be a President $year")
    }
    else if (age > 74){
        print("Byee Mr President , Ops You Age : $age We are in $year")
    }

}

fun sum(){
    var n1:Int = 10
    var n2:Int = 10
    var n3:Int = 5

    var sum : Int?
    sum=(n1+n2)*n3-3

    println("My Sumation ::: $sum")
    //Condition
    var isMarried :Boolean = true

    println("RelationShip" + !isMarried)
}