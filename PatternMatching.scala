//简单匹配
println("------------------------simple pattern match------------------------")
var colornum = 1
var colorstr = colornum match {
    case 1 => "Red"
    case 2 => "Green"
    case 3 => "Yellow"
    case _ => "else"

}
println(colorstr)

colornum = 4
colorstr = colornum match {
    case 1 => "Red"
    case 2 => "Green"
    case 3 => "Yellow"
    case unexcepted  => unexcepted+" is Not Allow"

}
println(colorstr)
//类型模式 ,匹配类型
println("------------------------type pattern match ------------------------")
for (elem <- List(9,12.3,"Spark","Hadoop","Hello")){
    var str = elem match{
        case i:Int => i +" is an int value "
        case s:String => s + " is a string value"
        case d:Double => d +" is a double value"
        case "Spark" => "Spark is mentioned ! "
        case _ => "This is unexcepted value"
    }
    println(str)
}
//guid 守卫语句
for(elem <- List(1,2,3,4)){
    elem match {
        case _ if (elem % 2 == 0) => println(elem +" is even")
        case _ => println(elem +" is odd ")
    }
}