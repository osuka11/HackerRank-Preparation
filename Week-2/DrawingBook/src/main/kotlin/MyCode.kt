import kotlin.math.min

fun pageCount(n: Int, p: Int): Int  = if( n%2 == 0)  minOf(p/2,(n+1-p)/2) else minOf(p / 2,(n-p) / 2)





fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val p = readLine()!!.trim().toInt()

    val result = pageCount(n, p)

    println(result)
}