fun main() {
    "push" example {
        val list = DoublyLinkedList<Int>()
        list.push(3).push(2).push(1)
        printList(list)
    }

    "append" example {
        val list = DoublyLinkedList<Int>()
        list.append(10).append(20).append(30)
        printList(list)
    }

    "inserting at a particular index" example {
        val list = DoublyLinkedList<Int>()
        list.push(33)
        list.push(22)
        list.push(11)
        println("Before inserting:")
        printList(list)
        var middleNode = list.node(1)!!
        for (i in 1..3) {
            middleNode = list.insert(-1 * i, middleNode)
        }
        println("After inserting")
        printList(list)
    }

    "inserting at a particular index" example {
        val list = DoublyLinkedList<Int>()
        list.push(4)
        list.push(5)
        list.push(6)
        println("Before inserting:")
        printList(list)
        for (i in 1..3) {
           list.insert(-1 * i, 1)
        }
        println("After inserting:")
        printList(list)
    }

        "removing a node after a particular node" example {
        val list = DoublyLinkedList<Int>()
        list.push(7)
        list.push(8)
        list.push(9)
        println("Before removing at particular index:")
            printList(list)
        val index = 1
        val node = list.node(index)!!
        val removedValue = list.remove(node)
        println("\nAfter removing at index $index:")
        println("Removed value: $removedValue")
            printList(list)

        println("\nAfter removing at index: 0")
            val removed = list.remove(0)
        println("Removed value: $removed")
        printList(list)
    }
}
