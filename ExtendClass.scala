/*抽象类*/
abstract class Car{
    val carBrand :String
    def info()
    def greeting(){printf("welcome to my car!\n")}
}
/*继承 extends
 override 关键字 重写非抽象方法必须有
*/
class BMWCar extends Car {
    override val carBrand = "BMW"
    def info(){printf("This is a %s car.It is on sale\n",carBrand)}
    override def greeting(){printf("welcome to my BMW Car!\n")}
}
class BYDCar extends Car{
    override val carBrand = "BYD"
    def info(){printf("This is a %s car",carBrand)}
    override def greeting(){printf("welcome to my BYD Car!\n")}
}
object Mycar{
    def main(args:Array[String]){
        val Mycar1 = new BMWCar()
        val MyCar2 = new BYDCar()

        Mycar1.greeting()
        Mycar1.info()
        MyCar2.greeting()
        MyCar2.info()
    }
}