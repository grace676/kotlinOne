fun main(args: Array<String>) {
    var marks=90
    var grade= if (marks<50) {
        "E"
    }else if (marks <60){"D"
    }else if (marks <70){
        "C"
    }else if (marks <80){
        "B"
    }else {
        "A"
    }
    println(grade)

    var bettingNumber=0
    var bettingResult=when(bettingNumber){
        1->{
            "Ooops!! You lost"
        }
     2->{
        "congrats!! You won"}
     3->{
        "Ooops!! You lost"
    } else->{
        "please enter a number from one to three"
    }
}
    println(bettingResult)
}