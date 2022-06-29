import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities

fun main(args: Array<String>) {
    var age=18
    if (age < 18){
        kotlin.io.println("Go home")
        }else{
            println("welcome to the party")
        }
    //grading system
    var marks=80
    if (marks <50){
        println("E")
    }else if(marks<60){
        println("D")

    }else if (marks<70){
        println("c")
    }else if(marks<80) {
        println("B")
    }else {
        println("A")}
    //BETTING SYSTEM
    var bettingNumber=0
    when(bettingNumber){
        1->{
            println("Ooops!! you are lost")
        }
    2->{
        println("Ooops!! you are lost")
    }
3->{
    println("Congrats you are won")
}
4->{
    println("Ooops!! you are lost")
}else->{
        println("please enter a number from one to ten")
    }
    }}

