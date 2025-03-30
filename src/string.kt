import java.util.*

fun main(args:Array<String>)
{
    var str: String ="Hellp World";
    var rawStr="""
        Amy Pond, there's something you'd
        better understand about me 'cause it's important,
        and one day your life may depend on it:
        I am definitely a mad man with a box!
        """

    println(rawStr);

    val strIterate="The quick brown fox";
    for(i in strIterate) println(i);

    println(strIterate[2]);


//var strNum=10 + ""// this won't work anymore
    var strNum=10.toString()//we have to explicitly convert now

    println(strNum);

    var name="John Doe"
    var email="john.doe@gmail.com"
    var phone="(01) 777-1234"

    var concat=String.format("name: %s | email: %s | phone:%s",name,email,phone)
    println(concat)


    var concatTemp="name: $name | email:$email | phone:$phone"
    println(concatTemp);

}