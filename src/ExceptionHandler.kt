import java.io.FileNotFoundException
import java.io.FileReader
import java.io.IOException

/**
 * Created by khatami.h on 11/27/2020.
 */
fun main(args:Array<String>)
{

    try {
        var fileReader= FileReader("README.txt")

        var content = fileReader.read();
        println(content);
    }
    catch (ffe: FileNotFoundException)
    {
        println(ffe.message)
    }
    catch (ioe: IOException)
    {
        println(ioe.message)
    }


}