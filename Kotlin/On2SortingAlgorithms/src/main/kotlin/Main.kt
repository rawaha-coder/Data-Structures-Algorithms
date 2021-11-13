import bubblesort.bubbleSort
import insertionsort.insertionSort
import selectionsort.selectionSort

fun main() {

    println("\n*** Kotlin O(n²) Sort Algorithms Code ***\n")

    "bubble sort" example {
        val list = arrayListOf(9, 4, 10, 3)
        println("Original: $list")
        list.bubbleSort(true)
        println("Bubble sorted: $list")
    }

    "selection sort" example {
        val list = arrayListOf(9, 4, 10, 3)
        println("Original: $list")
        list.selectionSort(true)
        println("Bubble sorted: $list")
    }
    
    "insertion sort" example {
        val list = arrayListOf(9, 4, 10, 3)
        println("Original: $list")
        list.insertionSort(true)
        println("Bubble sorted: $list")
    }
}