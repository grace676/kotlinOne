package oop

fun main(args: Array<String>) {
    var firstschool=FirstInterface.school()
    firstschool.orderGoods()
    println(firstschool.login())
}
interface FirstInterface {
    var age:Int
    fun login():String
    fun orderGoods(){
      println("yeah ,we order goods every week")
    }
    class school:FirstInterface{
        override var age: Int=100
        override fun login(): String{
            var loginMessage="HELLO, YOU CAN LOGIN"
            return loginMessage
        }
    }
}
