public class DoublyLinkedList<T> {
    Node<T> head;
    Node<T> tail;
    private int size;

    public DoublyLinkedList(){
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public synchronized DoublyLinkedList<T> push(T item){
        Node<T> newNode = new Node<>(item);
        if (head != null){
            newNode.next = head;
            head.previous = newNode;
        }else {
            tail = newNode;
            tail.next = null;
        }
        head = newNode;
        size++;
        return this;
    }

    public synchronized DoublyLinkedList<T> append(T value){
        if (isEmpty()){
            push(value);
            return this;
        }
        Node<T> newNode = new Node<>(value);
        newNode.previous = tail;
        tail.next = newNode;
        tail = newNode;
        size++;
        return this;
    }

    public Node<T> insert(T value, Node<T> afterNode) {
        if (tail == afterNode) {
            append(value);
            return tail;
        }
        Node<T> newNode = new Node<>(value);
        newNode.next = afterNode.next;
        newNode.previous = afterNode;
        afterNode.next.previous = newNode;
        afterNode.next = newNode;
        size++;
        return newNode;
    }

    public Node<T> nodeAt(int index){
        Node<T> currentNode = head;
        int currentIndex = 0;
        while (currentNode != null && currentIndex < index) {
            currentNode = currentNode.next;
            currentIndex++;
        }
        return currentNode;
    }

    public T pop() {
        if (isEmpty()) return null;

        T result = head.value;
        Node<T> temp = head;
        if (head.next != null){
            head = head.next;
            head.previous = null;
        }else {
            head = null;
        }
        temp.next = null;
        size--;
        if (isEmpty()) {
            tail = null;
        }
        return result;
    }
    
    /**
     * Prints out the list in an array format
     */
    public String toString() {
        StringBuilder represent = new StringBuilder("[");
        Node<T> nextNode = head;
        while (nextNode != null) {
            represent.append(nextNode.value);
            nextNode = nextNode.next;
            if (nextNode != null) {
                represent.append(",");
            }
        }
        represent.append("]");
        return represent.toString();
    }
}
