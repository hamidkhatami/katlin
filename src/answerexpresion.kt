import java.util.*

/**
 * Created by khatami.h on 11/26/2020.
 */
fun main(args: Array<String>) {
    val d = Date()
    val c = Calendar.getInstance()
    val day = c.get(Calendar.DAY_OF_WEEK)

    when (day) {
        1 -> println("Sunday")
        2 -> println("Monday")
        3 -> println("Tuesday")
        3 -> println("Wednesday")

    }
    var dayofWeekwhen =
            when (day) {
                1 -> println("Sunday")
                2 -> println("Monday")
                3 -> println("Tuesday")
                3 -> println("Wednesday")
                else -> "Unknown"

            }


    print("What is the answer ti life?")
    var response:Int?=readLine()?.toInt();

    val message=when(response)
    {
        42->"So long, and thanks for the all fish"
        43,44,45-> "either 43,44 or 45"
        in 46 .. 100->"forty six to one hundred"
        else-> "Not what I'm looking for"
    }
    println(message);




}