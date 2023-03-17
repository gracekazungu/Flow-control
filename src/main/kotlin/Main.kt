fun main(){
oddNumbers()

    println(arrayNames(arrayOf("Racheal","Becky","Melisa","Natalie","Victoria","Cate")))


    robotDecision(24)
    robotDecision(5)
    robotDecision(10)

    numbers()
}

//1. Create a function that prints out all the odd numbers between 1 and 100 (2pts)
fun oddNumbers(){
   for(num in 1..100) {
       if(num%2!=0){
           println(num)
       }
   }
}
//2. Create a function that takes in an array of names and returns the number of
//names longer than 5 characters (2pts)
fun arrayNames(names:Array<String>):Int{
//    for(name in names){
//        if(name.length>=5){
//            println(name)
//        }
//    }
    var count=0
    for (name in names){
        if (name.length>5){
            count++
        }
    }
    return count
}
//3. You are creating a robot to serve drinks at a party. The robot is required to
//serve a glass of milk for guests under the age of 6. For guests under the age of
//15 but over the age of 6, the robot serves a bottle of fanta orange. Everybody
//else gets a bottle of coca cola. Create a function that will make these
//decisions, printing out the name of the drink each person gets according to
//their age. (2pts)
fun robotDecision(age:Int){
when(age){
    in 0..6-> println("glass of milk")
    in 7..15-> println("botle of fanta orange")
    else-> println("bottle of coca cola")
}
}
//4. Write a function that prints each number from 1 to 100 on a new line. For each
//multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and
//5, print "FizzBuzz" instead of the number. (4pts)
fun numbers(){
    for (number in 1..100){
        if (number%3==0 && number%5==0){
            println("FizzBuzz")
        }
        else if(number%5==0){
            println("Buzz")
        }
        else if(number % 3==0){
            println("Fizz")
        }
    }

}