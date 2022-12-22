import java.util.*

fun main(args: Array<String>) {

    val testCases = readln().toInt()
    for (cs in 1..testCases) {
        val n = readln().toInt()
        val a = Array<Int>(n,{0})
        for (i in 0 until n) {
            a[i] = readln().toInt()
        }
        findZigZagSequence(a, n)
    }
}

fun findZigZagSequence(a: Array<Int>, n: Int) {
    a.sort()
    val mid = (n - 1) / 2
    var temp = a[mid]
    a[mid] = a[n - 1]
    a[n - 1] = temp

    var st = mid + 1
    var ed = n - 2
    while (st <= ed) {
        temp = a[st]
        a[st] = a[ed]
        a[ed] = temp
        st += 1
        ed -= 1
    }
    for (i in 0 until n) {
        if (i > 0) print(" ")
        print(a[i])
    }
    println()
}

