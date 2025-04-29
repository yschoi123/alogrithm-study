package queue;

import java.util.NoSuchElementException;

public class LinkedListQueue<E> implements Queue<E>{

    private int size;
    private Node<E> rear;
    private Node<E> front;

    /**
     * 가장 먼저 들어온 데이터를 제거하고 그 값을 반환한다
     * @return void
     */
    @Override
    public E dequeue() {
        if(isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }

        E frontData = front.getData();
        front = front.getNext();
        size--;
        return frontData;
    }

    /***
     * 새로운 데이터를 큐에 넣는다
     * @param data
     */
    @Override
    public void enqueue(E data) {
        Node<E> node = new Node<>(null, data);
        if(isEmpty()) {
            this.front = node;
            this.rear = node;
            size++;
            return;
        }

        this.rear.setNext(node);
        this.rear = node;
        size++;
        return;
    }

    /***
     * 가장 마지막에 넣은 데이터 값을 반환한다
     * @return E
     */
    @Override
    public E getRear() {
        return this.rear.getData();
    }

    /***
     * 가장 먼저 넣은 데이터 값을 반환한다
     * @return E
     */
    @Override
    public E getFront() {
        return this.front.getData();
    }

    /**
     * 큐의 크기를 반환한다
     * @return int
     */
    @Override
    public int getSize() {
        return this.size;
    }

    /**
     * 큐가 비었는지 그 여부를 반환한다
     * @return 비었으면 true, 아니면 false
     */
    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }
}
