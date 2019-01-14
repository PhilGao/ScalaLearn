object FuncReturnType{
// 等号 或者 大括号 必须存在一个


    //参数类型，返回值类型 等号 大括号
    def add(x:Int,y:Int):Int={
        x+y
    }
    def returnUnit():Unit = {
        println("another way to return voide")
    }
    //省略非Unit返回值；如果没有写返回值，则根据等号后面的东西进行类型推演
    def test(x:Int)={
        x
    }
    //省略等号,返回 Unit
    def returnVoid(){
        print("return void")
    }
    //省略花括号，如果函数仅包含一条语句，那么连花括号都可以选择不写
    def max(x:Int,y:Int) = if(x>y) x else y

    def greet() = println("Hello World")

    def main(args:Array[String]):Unit={
        println(add(1,2))
        println(test(1))
    }





}