import java.util.*

/**
 * Created by kevinjanvier on 22/09/2017.
 */


fun main(args:Array<String>){

    print("Enter Your Age : ")

    var year:Int = readLine()!!.toInt()

    var YearCalendar = Calendar.getInstance().get(Calendar.YEAR)

    println(" $YearCalendar")

    var my_ageIs = YearCalendar-year

    println("My Age is : $my_ageIs")
}
