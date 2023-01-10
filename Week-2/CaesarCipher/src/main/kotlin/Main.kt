
const val ALPHABET = "abcdefghijklmnopqrstuvwxyz"
fun caesarCipher(s: String, k: Int): String {
    var (newString, alphRotated) = arrayOf("","")
    val factor = ( k % ALPHABET.length)
    println(factor)
    for (i in factor .. ALPHABET.length-1){
        alphRotated += ALPHABET[i]
    }
    for(i in 0 .. factor-1){
        alphRotated += ALPHABET[i]
    }
    println(alphRotated)
    for(i in s){
        if (!i.isLetter()){
            newString+= i
        }else{
            val indexChar = ALPHABET.indexOf(i.toLowerCase())
            newString += if(i.isLowerCase()) alphRotated[indexChar] else alphRotated[indexChar].toUpperCase()
        }

    }


    return newString


}

fun main(args: Array<String>) {
    //val n = readLine()!!.trim().toInt()

    val s = readLine()!!

    val k = readLine()!!.trim().toInt()

    val result = caesarCipher(s, k)

    println(result)
}