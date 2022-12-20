fun sockMerchant(n: Int, ar: Array<Int>): Int {
    val arToSet = ar.toSet()
    var counter = 0
    arToSet.forEach{
            i -> counter += ar.filter{it==i}.size / 2
    }


    return counter

}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val ar = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = sockMerchant(n, ar)

    println(result)
}