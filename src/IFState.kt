import java.util.*

/**
 * Created by khatami.h on 11/26/2020.
 */
fun main(args:Array<String>)
{
    val theQuestion="Doctor who"
    val answer="Theta Sigma"
    val correctAnswer=""
    if(answer== correctAnswer)
    {
        println("You are correct")
    }

    val d= Date();
    val c= Calendar.getInstance();
    val day=c.get(Calendar.DAY_OF_WEEK);

    if(day==1)
    {
        println("Today is Sunday")
    }
    else if(day==2)
    {
        println("Today is Monday")
    }
    else if(day==3)
        println("Today is Tuesday");
    else
        println("a day of week")





    val theQuestionexpresion="Doctor who";
    val answerexpresion="Theta Sigma"
    val correctAnswerexpresion=" ";

    var message = if(answerexpresion == correctAnswerexpresion)
    {
        "You are correct"
    }
    else {
        "Try again"
    }

    println(message);
}

