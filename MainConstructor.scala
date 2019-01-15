//主构造器... 跟Java不一致,Java需要定义构造方法，方法名跟类名一致
// name,mode会自动变成这个类的属性
class Counter(name:String,mode:Int){
    private var value = 0 
    def increment(step:Int):Unit={ value += step}
    def current():Int = {value}
    def info()={printf("name is %s , value is %d",name,mode)}
}
object MyCounter{
    def main(args:Array[String]){
        val myCounter = new Counter("Timer",2)
        myCounter.increment(2)
        myCounter.info()

    }

}