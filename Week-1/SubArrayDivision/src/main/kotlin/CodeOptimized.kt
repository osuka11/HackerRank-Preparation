/*
Here are the differences functions that would to solve the exercise
 */
fun birthdayOptimized1(s: Array<Int>, d: Int , m:Int ): Int{
    var count = 0
    for ((i,j) in (m.. s.size step 1 ).withIndex()){
        if(s.copyOfRange(i,j).sum() == d) count++
    }
    return count
}
fun birthdayOptimized2(s: Array<Int>, d: Int , m:Int ): Int{
    var possibilities = 0
    for (i in 0..s.size-m){
        if (s.slice(i until i+m).reduce { acc, value -> acc + value } == d ) possibilities++
    }
    return possibilities
}
fun birthdayOptimized3(s: Array<Int>, d: Int , m:Int ): Int{
    var result = 0
    var list = s.toList()
    list.windowed(m).forEach{
        chunk -> if(chunk.sum() == d) result++
    }
    return result
}
