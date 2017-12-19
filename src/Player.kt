/**
 * Created by kevinjanvier on 18/12/2017.
 */
open class Player(val name:String, val age:String, val gender:String) {
    fun attack(){

    }


    fun defend(){

    }

    fun walk(){

        println("walk")
    }

}

class Thief(){

}

class Warrior() : Player("kevin", "22", "male"){

}