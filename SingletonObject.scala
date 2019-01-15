//单例对象 , 想当于一个静态的对象
object Person{
    private var lastId = 0
    def newPersonId() = {
        lastId += 1
        lastId
    } 
}

printf("The first person id is %d .\n",Person.newPersonId())
printf("The second person id is %d .\n",Person.newPersonId())
printf("The third person id is %d .\n",Person.newPersonId())