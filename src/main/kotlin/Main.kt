import java.util.*

fun main() {
//    var friends = arrayOf("Jane", "Wanda", "Chris", "John", "Mary", "Vee", "Ann", "Bree")
//   println(friends[0])
//    println(friends.get(4))
//    (friends.set(4, "Fiona"))
////    friends[3] = "David"
//    println(friends.contentToString())
//    var friend2023 = friends.plus("Brenda")
//    val febFriends = arrayOf("Bella", "Thimothy")
//   var latestFriends = friend2023.plus(febFriends)
//    println(latestFriends.contentToString())
//}
//    println(friends.indexOf("Jane"))
//    println(friends.indexOf("Chris"))
//    squareNumber(arrayOf(1,2,3,4,5,6,7))
//    squareNumber(arrayOf(8,9,10))
//


//    var numbers = arrayOf(213,422,5, 44, 42, 222)
//    println(friends.sortedArray().contentToString())
//    println(friends.contentToString())
//    numbers.sort()
//    println(numbers.contentToString())
////    var sortFriends = friends.sort()
////    println(sortFriends)
//
//
//    println(numbers.sum())
////    println(friends.min())
////    println(friends.max())
//    friends.forEach { friend -> println(friend) }
//
//    for(friend in friends){
//        println(friend)
//    }
//   arrInts(2,4,5)



//fun  arrInts( arra(3,5,6)) array<Int>{
//
//    val arrNumbers = arrayOf(x, y , z)
//    for (number in arrNumbers){
//        println(number*number)
//    }
//
//
//}
//fun squareNumber (nums: Array<Int>) {
//      nums.forEach { num ->
//          var result = num*num
//          println(result)
//
//      }
//}
    squareNumbers(arrayOf(1, 2, 3, 4, 5, 6, 8))
    squareNumbers(arrayOf(3, 6, 9, 11, 14, 17, 21))


//val numbers:IntArray = intArrayOf(1,2,3,4,5,6,7)
//    val numbers = intArrayOf(1,2,3,4,5)
    val numbers = arrayOf(1,2,3,4,5)
    println(" initial values:${numbers.contentToString()}")
    for(num in numbers){
        println(" ${num * 2}")
    }
    ///modify arrays
    numbers[0] = 7
    numbers[1] = 5
    numbers[2] = 2
    numbers[3] = 1
    print(" final values${numbers.contentToString()}")
    val months = listOf("January", "February", "March")
    val anyType = listOf(1,2, 4,4, 5, true,false, "String")
    print(anyType.size)
val newMonths = months.toMutableList()
    val additioipnalMonths = arrayOf("June", "July", "August")
    newMonths.addAll(additioipnalMonths)
    println(newMonths)


    //loop
    for(month in months){
        println(month)
    }

}

fun squareNumbers(nums: Array<Int>){
    nums.forEach{num ->
        var result = num * num
        println(result)
    }
//    for(num in nums){
//        var result = num * num
//        println(result)
//    }
    val fruits = arrayOf(Fruits("Apple", 34.56), Fruits("mango", 23.4))
    print(fruits.contentToString())
}

data class Fruits(val name: String, val price: Double)




