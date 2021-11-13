fun main() {

    println("\n*** Kotlin Radix Sort Algorithms Code ***\n")

    "radix sort" example {
        val list = arrayListOf(88, 410, 1772, 20)
        println("Original: $list")
        list.radixSort()
        println("Radix sorted: $list")
    }
}