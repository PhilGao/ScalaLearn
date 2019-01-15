/*
    伴随对象
    需要与主对象Class的名字相同，与此同时，在伴随对象的所有声明的变量&方法都是静态的。

    先要使用 Scalac Person 进行编译 ， 然后运行 Scala Person 或者是 scala -classpath .Person
    可以使用javap Person.class 进行反编译
 */
class Person{
    private val id = Person.newPersonId()//调用的伴随对象的方法
    private var name = ""
    def this(name : String) = {
        this()
        this.name = name
    }
    def info() = {
        printf("id is %d, name is %s\n",id,name)
    }

}
object Person{
    private var lastid = 0
    private def newPersonId():Int = {
        lastid += 1
        lastid
    }

    def main(args:Array[String]){
        val person1 = new Person("Tom")
        val person2 = new Person("Jim")
        person1.info()
        person2.info()
    }

}