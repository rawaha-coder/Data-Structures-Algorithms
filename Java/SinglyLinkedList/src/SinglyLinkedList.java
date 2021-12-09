public class SinglyLinkedList<E> implements Cloneable {
    private Node<E> head;
    private Node<E> tail;
    private int size = 0;

    public SinglyLinkedList(){}

    public int size() { return size; }

    public boolean isEmpty() { return size == 0; }

    public E first(){
        if (isEmpty()) return null;
        return head.getElement();
    }

    public E last(){
        if (isEmpty()) return null;
        return tail.getElement();
    }

    public void addFirst(E e){
        head = new Node<>(e, head);
        if (size == 0)
            tail = head; // special case: new node becomes tail also
        size++;
    }

    public void addLast(E e){
        Node<E> newest = new Node<>(e, null);
        if (isEmpty())
            head = newest;
        else
            tail.setNext(newest);
        tail = newest;
        size++;
    }

    public Node<E> nodeAt(int index){
        Node<E> currentNode = head;
        int currentIndex = 0;
        while (currentNode != null && currentIndex < index) {
            currentNode = currentNode.getNext();
            currentIndex++;
        }
        return currentNode;
    }

    public E removeFirst(){
        if (isEmpty()) return null;
        E answer = head.getElement();
        head = head.getNext();
        size--;
        if (size == 0)
            tail = null;
        return answer;
    }

    public boolean equals(Object o){
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        SinglyLinkedList other = (SinglyLinkedList) o;
        if (size != other.size) return false;
        Node walkA = head;
        Node walkB = other.head;
        while (walkA != null){
            if (!walkA.getElement().equals(walkB.getElement())) return false; //mismatch
            walkA = walkA.getNext();
            walkB = walkB.getNext();
        }
        return true;
    }

    public SinglyLinkedList<E> clone() throws CloneNotSupportedException{
        // always use inherited Object.clone() to create the initial copy
        SinglyLinkedList<E> other = (SinglyLinkedList<E>) super.clone(); // safe cast
        if (size > 0){
            other.head = new Node<>(head.getElement(), null);
            Node<E> walk = head.getNext(); // walk through remainder of original list
            Node<E> otherTail = other.head; // remember most recently created node
            while (walk != null){
                Node<E> newest = new Node<>(walk.getElement(), null);
                otherTail.setNext(newest); // link previous node to this one
                otherTail = newest;
                walk = walk.getNext();
            }
        }
        return other;
    }

    static class Node<E>{
        private E element;
        private Node<E> next;
        public Node(E e, Node<E> n){
            element = e;
            next = n;
        }

        public E getElement(){ return element; }
        public Node<E> getNext(){ return next;}
        public void setNext(Node<E> n){ next = n;}
    }
}
