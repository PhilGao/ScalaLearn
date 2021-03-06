import java.io.File
import scala.io.Source

object WordCount{
    //程序入口 main(args:Array[String])
    def main(args:Array[String]):Unit = { 
        val dirfile = new File("C:\\Users\\hagao\\Desktop\\11\\")
        val files = dirfile.listFiles // using case or if..else to prevent the invalid path ???
        for(file <- files) println(file)
        val listFiles = files.toList
        val wordsMap = scala.collection.mutable.Map[String,Int]()
        listFiles.foreach( 
            file => Source.fromFile(file).getLines().foreach( 
                line => line.split("").foreach(
                    word => {
                        if(wordsMap.contains(word)){
                            wordsMap(word) += 1
                        }else{
                            wordsMap+=(word -> 1)
                        }

                    }
                )    
            ) 
        )
        println(wordsMap)
        for((key,value) <- wordsMap) println(key+":"+value)
    }
}