fun getSubList(list: List<Int>, start: Int, end: Int ): MutableList<Int>{
    val subList = mutableListOf<Int>()
    for (i in start..end){
        subList.add(list[i])
    }
    return subList
}
fun birthday(s: Array<Int>, d: Int , m:Int ): Int{
    fun sumMatched(sum: Int, d: Int): Int = if(sum == d) 1 else 0

    var counter = 0

    for (i in 0 until (s.size -m+1)){
        val newArray = getSubList(s.toList(),i,m+i)
        counter += sumMatched(newArray.sum(),d)
    }
    return counter
}
fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val s = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val d = first_multiple_input[0].toInt()

    val m = first_multiple_input[1].toInt()

    val result = birthday(s, d, m)

    println(result)
}