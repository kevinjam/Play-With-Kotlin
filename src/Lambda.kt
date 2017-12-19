/**
 * Created by kevinjanvier on 18/12/2017.
 */

fun main(args: Array<String>) {

    //function literal
    val printMessage ={message:String -> println(message)}

    printMessage("hello wolrd")

    val sumA ={x :Int, y:Int ->x+y}

println(sumA(3, 8)
)
    val sumB :(Int, Int)->Int ={x,y->x+y}
    println(sumB)

    fun downloadData(url:String, completion:()-> Unit){
        //Send a download request
        //we got back data
        //there were no network erros
        completion()

    }
    //call downloadData Function

    downloadData("fakeUrl.com",{
        println("the code in this block , will only run After the completion")
    })

    fun dowloadCarData(url:String, completion:(CarDemo)->Unit){
        //send a download request
        // we got back car data
        val car = CarDemo("Tesla", "ModelX")
        completion(car)

    }

    dowloadCarData("fakeurl.com", {
        carDemo ->
        println(carDemo.make)
        println(carDemo.model)
    })

    dowloadCarData("fakeurl.com", {
        println(it.make)
        println(it.model)
    })

    fun downloadTruckData(url:String, completion:(CarDemo?, Boolean) ->Unit){
        //make the web request
        //we get the results back
        val webrequestSuccess = false
        if (webrequestSuccess){
            //received truck data
            val truck = CarDemo("Ford", "MM89")
            completion(truck, true)
        }else{
            completion(null, false)
        }
    }


    downloadTruckData("fakeurl.com"){
        carDemo, success ->
        if (success == true){
            carDemo?.make
        }else{
            //handle the web failure
            println("something went wrong")
        }
    }

    fun method(params:String, length:Int = 2){
        
    }
}