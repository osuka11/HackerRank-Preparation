

fun twoArrays(k: Int, A: Array<Int>, B: Array<Int>): String {
    fun areNotLower( a: Int, b: Int, k: Int): Boolean = if((a+b) < k) false else true

    val results = Array<Boolean>(A.size,{false})
    A.sort()
    B.sortByDescending { it }

    for(i in A.indices){
        results[i] = areNotLower(A[i],B[i],k)
    }
    return if(results.contains(false)) "NO" else "YES"

}

fun main(args: Array<String>){
    val q = readLine()!!.trim().toInt()

    for (qItr in 1 .. q){
        val firstMultipleInput = readLine()!!.trimEnd().split(" ")

        val n = firstMultipleInput[0].toInt()
        val k = firstMultipleInput[1].toInt()

        val A = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
        val B = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
        val result = twoArrays(k, A, B)

        println(result)
    }
}

