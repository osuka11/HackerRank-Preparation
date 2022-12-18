const val PM = "PM"
const val AM = "AM"
const val DOCE = "12"
fun timeConversionOptimized(s: String): String {

    var result = " "

    if(s.contains(PM) && s.contains(DOCE)){
        result = "12:${s.subSequence(3, 8)}"

    }else if(s.contains(PM)){
        val auxTime = (s.subSequence(0, 2).toString().toInt()) + 12
        result = "$auxTime:${s.subSequence(3, 8)}"

    }else if(s.contains(AM) && s.contains(DOCE)){
        result = "00:${s.subSequence(3, 8)}"

    }else if( s.contains(AM)){
        result = "${s.subSequence(0, 8)}"
    }
    return result
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val result = timeConversionOptimized(s)

    println(result)
}