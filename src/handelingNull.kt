import java.util.*

/**
 * Created by khatami.h on 12/1/2020.
 */
fun main(args: Array<String>)
{


    var str="Hello";

    //str=null; wonn't work

    var strNullable:String?="Heloo";
    //-----------------------------------------

    var a= arrayOf(1,2,3)

    printArr(null)
    printArr2(null);

}

fun printArr(arr: Array<Int>?) {


    if(arr!=null)
    {
        arr.forEach { i->println(i) }
    }

}
fun printArr2(arr: Array<Int>?) {
        arr?.forEach { i->println(i) }


}
