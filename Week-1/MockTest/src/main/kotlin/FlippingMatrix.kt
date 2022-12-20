
fun flippingMatrix(matrix: Array<Array<Int>>):Int{
    val size = matrix.size -1
    val halfSize = matrix.size/2
    var sumMax = 0
    for (i in 0 until halfSize){
        for( j in 0 until halfSize){
            sumMax += Math.max(
                Math.max(matrix[i][j], matrix[size-i][size-j]),
                Math.max(matrix[i][size-j], matrix[size-i][j])
            )
        }
    }
    return sumMax
}
