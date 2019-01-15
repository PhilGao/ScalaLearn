class Counter {
    //主构造器为空
    private var value = 1 
    private var name = ""
    private var mode = 1 // 1 for step counter , 2 for time counter 

    //辅助构造器1
    def this(name:String){
        this() //调用主构造器
        this.name = name
    }
    //辅助构造器2
    def this(name:String,mode:Int){
        this(name)
        this.mode = mode 
    }
    def increment(step:Int){value+=step}
    def current():Int = {value}
    def info(){printf("name is %s , value is %d\n",name,value)}

}
object MyCounter{
    def main(args:Array[String]){
        var counter1 = new Counter
        var counter2 = new Counter("Runner")
        var counter3 = new Counter("Timer",2)

        counter1.info()
        counter1.increment(1)      
        printf("counter1 current value is %d \n",counter1.current)
        counter2.info
        counter2.increment(2)
        printf("counter2 current value is %d \n",counter2.current)
        counter3.info()
        counter3.increment(3)
        printf("counter3 current value is %d \n",counter3.current)


    }

}
