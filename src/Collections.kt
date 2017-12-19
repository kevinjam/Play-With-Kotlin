/**
 * Created by kevinjanvier on 11/12/2017.
 */
fun main(args: Array<String>) {
    val imperials = listOf("Emperor", "Darth Vader", "Boba Fett", "Turkey", "Kevin", "Jame")

    println(imperials.sorted())
    println(imperials.last())
    println(imperials.first())
    println(imperials.contains("Isabella"))
    println(imperials[4])
    println(imperials)

    val rebels = arrayListOf("Leiah", "Luke", "Han Solo", "Mon Motham")
    println(rebels.size)
    println(rebels.add("Chubaka"))
    println(rebels)
    println(rebels.add(0, "Mama"))
    println(rebels)

    println(rebels.indexOf("Luke"))
    println(rebels)

    println(rebels.remove("Leiah"))
    println(rebels)

    //Map collection to key pair

    val rebelVehiclesMap = mapOf("Solo" to "Millenium Falcon", "Luke" to "Landspeeder")

    println(rebelVehiclesMap["Solo"])
    println(rebelVehiclesMap.get("solo"))
    println(rebelVehiclesMap.keys)
    val rebelsVehiclesHasMap = hashMapOf("Solo" to "Millenium Falcon", "Luke" to "Landspeeder")
    rebelsVehiclesHasMap["Luke"] = "Xmass"
    rebelsVehiclesHasMap.put("Leila", "Tantive IV")
    println(rebelsVehiclesHasMap)
    rebelsVehiclesHasMap.remove("Luke")
    println(rebelsVehiclesHasMap)
    rebelsVehiclesHasMap.clear()
    println(rebelsVehiclesHasMap)
}