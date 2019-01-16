/*特质 trait 类似接口
extends trait1 with trait2 with trait 3...
*/
trait CarID{
    var id : Int
    def currentID():Int
}
trait CarGreeting{
    def greeting(){printf("greeting from car!")}
}
class myCar extends CarID with CarGreeting{
    var id = 10000
    def currentID():Int = {id += 1 ; id }
    override def greeting(){printf("greeting from car!")}
}
object Car {
    def main(args:Array[String]){
        val firstcar = new myCar() // class still need the val or var at the first place
        printf("mycar1 's current id is %d'",firstcar.currentID)

    }

}