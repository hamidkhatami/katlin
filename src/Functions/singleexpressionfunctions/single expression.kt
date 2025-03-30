package Functions.singleexpressionfunctions

import javax.net.ssl.HostnameVerifier

/**
 * Created by khatami.h on 12/18/2020.
 */
fun main(arg:Array<String>)
{
    println("a+b");
    println(sumInt(2,3))
    println("a+b sumRet");
    println(sumInt(2,3))

//    connectToDb( password = "123");
    connectToDb();
//Named parameters
    connectToDb(hostname="hamid",username = "khatami",password = "pass");
//not allowed
    //connectToDb(hostname = "hamid",username = "khatami","pass")

    connectToDb("hamid",username = "khatami",password = "pas");

    println("------------------------Variable Number of Arguments-------------------------")
    manyParams(1,2,3);
    
    manyParams("from","gallifrey","to","Trenzalore");


    manyParams(*arg);
    manyParams(*"Hello there".split(" ").toTypedArray())

}

fun sumInt(a:Int,b:Int)=a+b;

fun sumIntret(a:Int,b:Int):Int=a+b;

//Default parameters

fun connectToDb(hostname:String="localhost",username:String ="mysql",password:String="secret")
{}

fun<T> manyParams(vararg va :T)
{
    for (i in va)
        println(i)

}

