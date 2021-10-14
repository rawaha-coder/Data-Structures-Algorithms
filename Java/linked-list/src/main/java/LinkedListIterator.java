import java.util.Iterator;
import java.util.function.Consumer;

public class LinkedListIterator<T> implements Iterator<T> {
    LinkedList<T> linkedList;
    private Node<T> lastNode = null;
    private int index = 0;

    LinkedListIterator(LinkedList<T> linkedList){
        this.linkedList = linkedList;
    }
    @Override
    public boolean hasNext() {
        return index < linkedList.size();
    }

    @Override
    public T next() {
        if (index >= linkedList.size()) throw new IndexOutOfBoundsException();
        if (index == 0) {
            lastNode = linkedList.nodeAt(0);
        } else {
            lastNode = lastNode.getNext();
        }
        index++;
        return lastNode.getData();
    }

    @Override
    public void remove() {
        if (index == 1) {
            linkedList.pop();
        } else {
            if (linkedList.nodeAt(index - 2) == null) return;
            Node<T> prevNode = linkedList.nodeAt(index - 2);
            linkedList.removeAfter(prevNode);
            lastNode = prevNode;
        }
        index--;
    }

    @Override
    public void forEachRemaining(Consumer action) {
        throw new UnsupportedOperationException();
    }
}
