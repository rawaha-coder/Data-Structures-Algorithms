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

    public DoublyLinkedList<T> push(T item){
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
