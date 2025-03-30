package Functions

import sun.security.pkcs11.wrapper.CK_C_INITIALIZE_ARGS

/**
 * Created by khatami.h on 12/18/2020.
 */

fun main(arg: Array<String>)
{
    displayedMessage("Hello World!",10)
    displayedMessage2("Hello World!",10)
    println("--------------------Sum Of Values----------------------------");
    println(getSum(listOf(1,2,3,4,5,6)));

    println("--------------------Print Pair a:10 , b:15----------------------------");

    var(a,b)= bigSmall(10,15);
    println(a);
    println(b);
    println("--------------------Print Pair a:100 , b:95----------------------------");
    var(a1,b1)= bigSmall(10,15);
    println(a1);
    println(b1);




}

fun displayedMessage(msg:String,count:Int)
{
    var counter=1;
    while(counter++<=count)
    {
        println(msg)
    }
}

fun displayedMessage2(msg:String,count:Int):Unit{
    println("------------------------ With Unit return Type-------------------------")
    var countter=1
    while(countter++<count)
    {
        println(msg);
    }
}
fun getSum(values: List<Int>):Int{
    var total=0;
    for(i in values)
        total+=i;
    return total;
}

fun bigSmall(a:Int,b:Int):Pair<Int,Int>
{
    if(a>b) return Pair(a,b)
    else
    {
        return Pair(b,a);
    }
}