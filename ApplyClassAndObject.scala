/* 
Apply & Update 方法：
var a = Array("1","a","b")  这里就是一个apply方法的现实运用。 注意的就是 ， 实例化一个对象需要使用new 关键字
a(0)="BigData" 这是对update的是个实现。

*/
class TestApplyClassAndObject{
}
class ApplyTest{
    def apply(){
        printf("apply method in apply class is called\n")
    }
    def greetingFromClass():Unit = {
        println("Greeting from Class ApplyTest")
    }
}
object ApplyTest{
    //这里由于会返回一个ApplyTest实例，所以等号不能省略，否则会认为返回一个Unit的实例。
    def apply() = {
        printf("apply method in apply object is called \n")
        new ApplyTest()
    }
    
}
object TestApplyClassAndObject{
    def main (args:Array[String]){
        val a = ApplyTest() // 这里没有new 也就是说不是实例化一个对象, 他会调用伴随对象的apply()方法 同时返回一个ApplyTest实例
        a.greetingFromClass() //这里调用该实例的greetingFromclass方法
        a() //这里由于a已经是个实例了，这里会调用他的类定义里面的 apply方法
    }
}

/*
运行结果：
apply method in apply object is called
Greeting from Class ApplyTest
apply method in apply class is called

*/
