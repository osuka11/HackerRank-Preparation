
fun findMedian(arr: Array<Int>): Int = arr.sorted().get(arr.size/2)
fun main(){
    val arr = readLine()!!.trim().map { it.toInt() }.toTypedArray()
    val median = findMedian(arr)
    println(median)
}