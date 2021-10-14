import java.util.Collection;
import java.util.Iterator;

public class LinkedList<T> implements Collection<T> {
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

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty(){
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (T item : this) {
            if (item == o) return true;
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator<>(this);
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean add(T t) {
        append(t);
        return true;
    }

    @Override
    public boolean remove(Object o) {
        Iterator<T> iterator = iterator();
        while (iterator.hasNext()) {
            T item = iterator.next();
            if (item == o) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        boolean result = false;
        for (Object item : c) {
            result = remove(item) || result;
        }
        return result;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object item : c) {
            if (!contains(item)) return false;
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        for (T element : c) {
            append(element);
        }
        return true;
    }



    @Override
    public boolean retainAll(Collection<?> c) {
        var result = false;
        Iterator<T> iterator = this.iterator();
        while (iterator.hasNext()) {
            T item = iterator.next();
            if (!c.contains(item)) {
                iterator.remove();
                result = true;
            }
        }
        return result;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
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
