fun matchingStringsOptimized(strings: Array<String>, queries:Array<String>): Array<Int> =
    queries.map{i -> strings.count{ it == i}}.toTypedArray()
//i = every element of queries
//it = every element of strings

fun main(args: Array<String>) {
    val stringsCount = readLine()!!.trim().toInt()

    val strings = Array<String>(stringsCount, { "" })

    for(i in 0 until stringsCount){
        val stringsItem = readLine()!!
        strings[i] = stringsItem
    }
    val queriesCount = readLine()!!.trim().toInt()

    val queries = Array<String>(queriesCount, {""})

    for ( i in 0 until queriesCount){
        val queriesItem = readLine()!!
        queries[i] = queriesItem
    }
    val res = matchingStrings(strings, queries)
    println(res.contentToString())

}