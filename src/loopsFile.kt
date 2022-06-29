fun main(args: Array<String>) {
    //while loop
    var countOne=0
    while (countOne <=5){
        println(countOne)
        countOne++
    }

//do while loop
var countTwo=10
do{
    println(countTwo)
    countTwo++
}while (countTwo <=15)

//repeat loop
repeat(5){
    println("Good morning")
}

    //FOR LOOP
    var names= arrayOf("sofia","leon","bradley","joshua","vascan")
    //names.sort
    names.sortDescending()
    for (jina in names){
        println(jina)}
var ascendingNumber=0 .. 20
    for (nambari in ascendingNumber){
        println(nambari)
}
    var descendingNumber=20 downTo  0
    for (n in descendingNumber){
        println(n)
    }
}
