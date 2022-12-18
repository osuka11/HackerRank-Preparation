fun miniMaxSumOptimized(arr: Array<Int>): Unit {
    arr.sort()
    val longArr: Array<Long> = arr.map { it -> it.toLong() }.toTypedArray()

    val minSum:Long  = (longArr.sum() - arr.last()).toLong()
    val maxSum:Long  = (longArr.sum() - arr.first()).toLong()
    println("$minSum $maxSum")
}

fun main(args: Array<String>) {

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    miniMaxSumOptimized(arr)
}