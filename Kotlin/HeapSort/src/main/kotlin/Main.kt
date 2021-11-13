fun main() {

    println("\n *** Kotlin Heap Sort Algorithms Code *** \n")

    "Heap sort" example {
        val array = arrayOf(6, 12, 2, 26, 8, 18, 21, 9, 5)
        array.heapSort(ascending)
        print(array.joinToString())
    }
}