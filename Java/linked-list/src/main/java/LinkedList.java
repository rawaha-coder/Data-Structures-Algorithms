public class LinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size = 0;

    LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public synchronized Node<T> getHead(){
        return head;
    }
    public int length(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public synchronized LinkedList<T> push(T value){
        head = new Node<>(value, head);
        if (tail == null) {
            tail = head;
        }
        size++;
        return this;
    }

    public synchronized void append(T value) {
        if (isEmpty()) {
            push(value);
            return;
        }

        Node<T> newNode = new Node<>(value);
        tail.setNext(newNode);
        tail = newNode;
        size++;
    }

    public Node<T> insert(T value, Node<T> afterNode) {
        if (tail == afterNode) {
            append(value);
            return tail;
        }
        Node<T> newNode = new Node<>(value, afterNode.getNext());
        afterNode.setNext(newNode);
        size++;
        return newNode;
    }

    public Node<T> nodeAt(int index){
        Node<T> currentNode = head;
        int currentIndex = 0;
        while (currentNode != null && currentIndex < index) {
            currentNode = currentNode.getNext();
            currentIndex++;
        }
        return currentNode;
    }

    public T pop() {
        if (isEmpty()) return null;

        T result = head.getData();
        head = head.getNext();
        size--;
        if (isEmpty()) {
            tail = null;
        }

        return result;
    }

    public T removeLast() {
        Node<T> head = this.head != null ? this.head : null;

        if (head == null) return null;

        if (head.getNext() == null) return pop();

        size--;

        Node<T> previous = head;
        Node<T> current = head;

        Node<T> next = current.getNext();
        while (next != null) {
            previous = current;
            current = next;
            next = current.getNext();
        }

        previous.setNext(null);
        tail = previous;
        return current.getData();
    }

    public T removeAfter(Node<T> node){
        T result = node.getNext().getData();
        if (node.getNext() == tail) {
            tail = node;
        }
        if (node.getNext() != null) {
            size--;
        }
        node.setNext(node.getNext().getNext());
        return result;
    }

    /**
     * Recursively traverse this list and print the node value
     */
    private void printList(Node<T> node) {
        if (node.getNext() != null){
            System.out.print(node.getData() + " -> ");
            printList(node.getNext());
        } else {
            System.out.println(node.getData());
        }
    }

    public void print(){
        printList(head);
    }

}
