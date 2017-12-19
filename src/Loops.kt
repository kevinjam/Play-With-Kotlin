/**
 * Created by kevinjanvier on 12/12/2017.
 */
fun main(args: Array<String>) {
    val rebels = arrayListOf("Leiah", "Luke", "Han Solo", "Mon Motham")
    val rebelsVehiclesHasMap = hashMapOf("Solo" to "Millenium Falcon", "Luke" to "Landspeeder" , "Kevin " to "Programmer",
            "Uganda" to "kampala", "DRCongo " to "Kinshasa")

    for (reb in rebels){
        println("rebels:== == $reb")
    }

    for ((key, value) in rebelsVehiclesHasMap){
        println("The Kye :: $key  Values :: $value")
    }

    //while loop

    var x = 20
    while (x > 10){
        println(x)
        x--
    }
}