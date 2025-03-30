/**
 * Created by khatami.h on 11/25/2020.
 */
fun main(args:Array<String>)
{

    var emptyArray=arrayOfNulls<String>(2)
    emptyArray[0]="Hello";
    emptyArray[1]="world";

    for (i in emptyArray.indices) println(emptyArray[i])
    for (i in emptyArray) println(i);

    var arraysOfInts=arrayOf(1,2,3,4,5,6)
    arraysOfInts.forEach { e-> println(e) }

    var arrayWords="The quick brown fox".split(" ").toTypedArray()

    arrayWords.forEach { item->println(item) }


}