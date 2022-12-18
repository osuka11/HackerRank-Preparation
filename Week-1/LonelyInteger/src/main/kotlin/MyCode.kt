
fun lonelyInteger(a: Array<Int>): Int{
    var lonely = 0
    for(i in a){
        if(a.count{it == i} == 1){
            lonely = i
        }
    }
    return lonely
}
fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = lonelyInteger(a)

    println(result)
}