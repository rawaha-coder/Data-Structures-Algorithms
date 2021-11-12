class DoublyLinkedList<T : Any> {

    private var head: Node<T>? = null
    private var tail: Node<T>? = null
    var size = 0
        private set

    fun isEmpty(): Boolean {
        return size == 0
    }

    override fun toString(): String {
        if (isEmpty()) {
            return "Empty list"
        }
        return head.toString()
    }

    fun push(value: T): DoublyLinkedList<T> = apply {
        val newNode = Node(value = value, next = head)
        if (isEmpty()) {
            head = newNode
            tail = newNode
            this.size++
            return this
        }

        head?.previous = newNode
        head = newNode
        this.size++
    }

    fun append(value: T): DoublyLinkedList<T> = apply {
        val newNode = Node(value = value, previous = tail)
        if (isEmpty()) {
            head = newNode
            tail = newNode
            this.size++
            return this
        }

        tail?.next = newNode
        tail = newNode
        this.size++
    }

    fun node(index: Int): Node<T>? {
        // 1
        var currentNode = head
        var currentIndex = 0

        // 2
        while (currentNode != null && currentIndex < index) {
            currentNode = currentNode.next
            currentIndex += 1
        }
        return currentNode
    }

    fun insert(value: T, afterNode: Node<T>): Node<T> {
        val next = afterNode.next
        if (tail == afterNode) {
            append(value)
            return tail!!
        }

        val newNode = Node(value = value, next = afterNode.next, previous = afterNode)
        afterNode.next = newNode
        next?.previous = newNode
        size++
        return newNode
    }

    fun insert(value: T, index: Int): Node<T>? {
        if (index > this.size || index < 0) return null
        if (index == 0) push(value)
        if (index == size) append(value)
        val newNode = Node(value)
        var h = this.head
        var curr = 0
        while (curr < index - 1) {
            h = h?.next
            curr++
        }
        val nextNode = h?.next
        newNode.next = nextNode
        nextNode?.previous = newNode
        h?.next = newNode
        newNode.previous = h
        this.size++
        return newNode
    }

    fun remove(node: Node<T>): T {

        val prev = node.previous
        val next = node.next

        if (prev != null) {
            prev.next = next
        } else {
            head = next
        }

        next?.previous = prev

        if (next == null) {
            tail = prev
        }

        node.previous = null
        node.next = null
        size--
        return node.value
    }

    fun remove(index: Int) : T? {
        if (index >= size || index < 0) return null
        return remove(node(index)!!)
    }

    val first: Node<T>?
        get() = head

    val last: Node<T>?
        get() = tail

}