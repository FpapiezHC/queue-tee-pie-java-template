package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testQueueEnqueueAndSize() {
        QueueTees queue = new QueueTees();
        assertEquals(0, queue.size());

        queue.enqueue(new Puppy());
        queue.enqueue(new Kitty());
        assertEquals(2, queue.size());
    }

    @Test
    void testDequeueOrder() {
        QueueTees queue = new QueueTees();
        Puppy puppy = new Puppy();
        Kitty kitty = new Kitty();
        queue.enqueue(puppy);
        queue.enqueue(kitty);

        Cutie first = queue.dequeue();
        Cutie second = queue.dequeue();

        assertEquals("A little puppy with big, sad eyes", first.description());
        assertEquals("A fluffy kitty that purrs loudly", second.description());
    }

    @Test
    void testDequeueEmpty() {
        QueueTees queue = new QueueTees();
        assertNull(queue.dequeue(), "Dequeuing from an empty queue should return null");
    }

    @Test
    void testClear() {
        QueueTees queue = new QueueTees();
        queue.enqueue(new Puppy());
        queue.enqueue(new Kitty());
        queue.clear();
        assertEquals(0, queue.size());
    }
}
