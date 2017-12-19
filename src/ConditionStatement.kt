/**
 * Created by kevinjanvier on 22/09/2017.
 */
fun main(args: Array<String>) {
    val isHungry = false
    val isBored = true

    // || or
    if (isHungry || isBored) {
        println("Lets get pizza")
    }

    //when
    val x = 3

    when (x) {
        1 -> println("x==1")
        2 -> println("x==2")
        else -> println("x does not equal to 1 or 2")
    }
    fun vaderIsFeeling(mood: String = "angry") {
        if (mood == "angry") {
            println("run for the hills , vader is $mood")
        } else {
            println("whatever you do , don't make him angry")
        }
    }
    vaderIsFeeling("happy")
}