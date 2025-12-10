interface NewInterface{
    fun run(){
        println("this is run from interface")
    }
    fun stop()
}
class MClass: NewInterface{
    fun classrun(){
        println("this is class run")
    }
    override fun stop(){
        println("this is stop from class")
    }
}
fun main(){
    val obj = MClass()
    obj.run()
    obj.stop()
    obj.classrun()
}