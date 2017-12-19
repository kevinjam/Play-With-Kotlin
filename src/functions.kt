/**
 * Created by kevinjanvier on 11/12/2017.
 */
fun main(args: Array<String>) {


    fun forceChoke(){
        println("you have failed me for the last time")
    }

    forceChoke()

    fun makeAnEntrance(line:String){
        println(line)
    }

    makeAnEntrance("I find your lack of faith disturbing")

    fun calculateNumberGoodguys(rebels:Int, eworks:Int):Int{

        val goodGuys = rebels + eworks

        return goodGuys
    }

    val rebels = calculateNumberGoodguys(5, 7)
    //val rebels 12
    println(rebels)

}

