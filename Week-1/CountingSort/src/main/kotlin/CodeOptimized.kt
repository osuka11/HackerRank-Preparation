
fun countingSortOptimized(arr: Array<Int>): Array<Int>{
    val results = Array<Int>(100,{0})
    arr.forEach {
        i -> results[i]++
    }
    return results
}
fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = countingSort(arr)

    println(result.joinToString(" "))
}