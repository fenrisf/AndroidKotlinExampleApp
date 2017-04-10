package fenrisf.com.trainingapp

/**
 * Created by albertomartinez on 6/04/17.
 */
fun getItems (): List<Item>{
    return (1..10).map {Item(it.toLong(), "title$it", "http://lorempixel.com/400/400/cats/$it/")}
}
data class Item(val id:Long, val titulo:String, val url:String)