public class LinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size = 0;

    LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public LinkedList<T> push(T value){
        head = new Node<>(value, head);
        if (tail == null) {
            tail = head;
        }
        size++;
        return this;
    }

    public void append(T value) {
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
