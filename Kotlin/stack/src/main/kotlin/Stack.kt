interface Stack<T : Any> {
    val count: Int
        get
    fun push(element: T)
    fun pop(): T?
    fun peek(): T?
}

fun <T : Any> stackOf(vararg elements: T): Stack<T> {
    return StackImpl.create(elements.asList())
}