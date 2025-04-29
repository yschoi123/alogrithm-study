package queue;

import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {

    @Test
    public void checkLinkedListQueue() {
        Queue<Integer> queue = new LinkedListQueue<>();

        queue.enqueue(30);
        queue.enqueue(3);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(3);
        queue.enqueue(100);

        assertEquals(queue.getSize(), 6);
        assertEquals(queue.getFront(), 30);
        assertEquals(queue.getRear(), 100);
        assertEquals(queue.dequeue(), 30);
        assertEquals(queue.dequeue(), 3);
        assertEquals(queue.dequeue(), 5);
        assertEquals(queue.dequeue(), 6);
        assertEquals(queue.dequeue(), 3);
        assertEquals(queue.dequeue(), 100);
        assertThrows(NoSuchElementException.class, () -> queue.dequeue());
    }
}