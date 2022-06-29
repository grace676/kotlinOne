fun main(args: Array<String>) {
motto()
    avg(455,600.0,645.0f)
    println((addition(300,400.0)))
    login("king")
    login("king@gmail.com","king123")
}
fun motto(){
    println("hello this is our motto")
}
fun avg(x:Int,Y:Double,z:Float){
    var average=(x + Y+z)/3.0
    println("hello your average is $average")

}

fun addition(x: Int,y: Double):Double{
 var answer=x+y
 return answer
}
fun login(name:String){
    println("your name is $name")
}
fun login(email:String, password:String){

    println("your name is $email and your password is $password")
}