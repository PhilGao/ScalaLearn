class Counter{
    private var pvalue = 1 
    def value = pvalue // def value function,可以省略掉 返回值类型以及大括号, like setAttr..
    //def value_= 是一个函数，参数Int 
    def value_=(newvalue:Int){
        if(newvalue>0) pvalue=newvalue
    }
    def increment(step :Int):Unit = {
        value +=step
    }
    def current():Int={pvalue}
    def show {println("show function")}
}

object MyCounter{
    def main(args:Array[String]){
        val myCounter = new Counter
        println(myCounter.value)
        myCounter.value = 3 //value 函数
        println(myCounter.value)
        myCounter.increment(1)
        println(myCounter.current())
        myCounter.show
    }
}