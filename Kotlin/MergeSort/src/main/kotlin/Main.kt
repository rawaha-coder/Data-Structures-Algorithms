fun main() {

    println("\n*** Kotlin Merge Sort Algorithms Code ***\n")

    "merge sort" example {
        val list = listOf(7, 2, 6, 3, 9)
        println("Original: $list")
        val result = list.mergeSort()
        println("Merge sorted: $result")
    }

}