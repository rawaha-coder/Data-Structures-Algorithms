infix fun String.example(function: () -> Unit) {
    println("---Example of $this---")
    function()
    println()
}

fun printList(list: DoublyLinkedList<Int>){
    var head = list.first
    println("\nTraversal in forward direction \n")
    while (head != null) {
        println("${head.value}")
        head = head.next
    }
    var tail = list.last
    println("\nTraversal in reverse direction \n")
    while (tail != null) {
        println("${tail.value}")
        tail = tail.previous
    }
}

