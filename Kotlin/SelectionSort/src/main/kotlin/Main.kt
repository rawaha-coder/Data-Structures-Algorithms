fun main(args: Array<String>) {
    println("\n*** Algorithms Selection Sort ***\n")

    val listInt = mutableListOf(5,7,1,3,4,5,6)
    println(selectSort(listInt))
}

fun findSmallest(arr: MutableList<Int>): Int{
    var smallest = arr[0]
    var smallestIndex = 0
    for (i in 1 until arr.size){
        if(arr[i] < smallest) {
            smallest = arr[i]
            smallestIndex = i
        }
    }
    return smallestIndex
}

fun selectSort(arr: MutableList<Int>): MutableList<Int>{
    if (arr.size < 1)return mutableListOf()
    val list = arr.toMutableList()
    val newArray: MutableList<Int> = mutableListOf()
    for (i in 0 until list.size){
        val smallestIndex = findSmallest(list)
        newArray.add(list.removeAt(smallestIndex))
    }
    return newArray
}