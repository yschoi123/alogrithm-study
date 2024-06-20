package list.linkedList;

public class ListNode<E> {
    private E data;
    public ListNode<E> next;

    public ListNode() {
        this(null, null);
    }

    public ListNode(E data) {
        this(data, null);
    }

    public ListNode(E data, ListNode<E> nextNode) {
        this.data = data;
        this.next = nextNode;
    }

    public E getData() {
        return data;
    }
}
