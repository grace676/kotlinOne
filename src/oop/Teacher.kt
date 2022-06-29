package oop

fun main(args: Array<String>) {
    var firstBoardMember=Boardmember("ben",100)
    firstBoardMember.viewResults()
    var firststudent=student("consolata",105)
    firststudent.viewResults()
    firststudent.publishMagazine()
}
open class Teacher(open var name:String,open var age: Int) {
    fun viewResults() {
        println("Hello $name,you can view results")
    }

    fun publishMagazine() {
        println("Yeah,you can publish the magazine at $age year old")
    }
}

 open class Boardmember(name: String,age: Int):Teacher(name,age){

}
class student(name: String,age: Int):Boardmember(name, age){
    fun login(){
        println("yeah i can login")
    }
}