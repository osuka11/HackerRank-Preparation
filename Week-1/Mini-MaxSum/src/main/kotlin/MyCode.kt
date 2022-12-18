
fun plusMinus(arr: Array<Int>): Unit {

    val zeros: Float = arr.filter { z -> z == 0 }.size.toFloat()
    val negatives: Float = arr.filter { z -> z <= -1 && z >= -1000  }.size.toFloat()
    val positives: Float = arr.filter { z -> z >= 1 && z <= 1000 }.size.toFloat()

    println(String.format("%.6f", positives/arr.size))
    println(String.format("%.6f", negatives/arr.size))
    println(String.format("%.6f", zeros/arr.size))



}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    plusMinus(arr)
}
