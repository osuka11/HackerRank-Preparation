
fun miniMaxSum(arr: Array<Int>): Unit {
    var minSum : Long = 0L
    var maxSum : Long = 0L
    arr.sort()
    if (arr.first() == arr.last()){
        println("${arr.sum() - arr[0]} ${arr.sum() - arr[0]}")
    }else{
        for(i in arr){
            if( i > arr.first()) maxSum += i
            if( i<arr.last()) minSum += i
        }
        println("$minSum $maxSum")
    }

}

fun main(args: Array<String>) {

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    miniMaxSum(arr)
}