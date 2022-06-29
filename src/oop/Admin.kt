package oop

fun main(args: Array<String>) {
    var firstAdmin =Admin("King", 900000.00, "king@gmail.com")
    firstAdmin.registerUser()
    println(firstAdmin.salary)

    firstAdmin.setidNumber("98987654")
    println(firstAdmin.getidNumber())

}
class Admin {
    var name:String
    var salary:Double
    var email:String
    private  var phoneNumber:String = ""
    private  var idNumber:String = ""

    constructor(name:String, salary:Double, email:String){
        this.name = name
        this.salary = salary
        this.email = email
    }
    fun registerUser(){
        println("Yeah, I cam register a user")
    }

    fun suspendEmployee(){
        println("Yeah, I can suspend an employee")
    }

    fun setPhoneNumber(phoneNumber:String){
        this.phoneNumber = phoneNumber
    }

    fun getPhoneNumber():String{
        return this.phoneNumber
    }

    fun setidNumber(idNumber:String){
        this.idNumber = idNumber
    }
    fun getidNumber():String{
        return this.idNumber
    }
}