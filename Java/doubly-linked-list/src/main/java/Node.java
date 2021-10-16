public class Node<T> {
    T value;
    Node<T> next ;
    Node<T> previous;

    Node(){
    }

    Node(T value){
        this.value = value;
        next = null;
        previous = null;
    }

    Node(T value, Node<T> next, Node<T> previous) {
        this.value = value;
        this.next = next;
        this.previous = previous;
    }

}
