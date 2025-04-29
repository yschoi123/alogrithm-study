package queue;

public interface Queue<E> {

    E dequeue();
    void enqueue(E data);
    E getRear();
    E getFront();
    int getSize();
    boolean isEmpty();
}
