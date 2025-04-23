package org.example;

public class App {
    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        Kitty kitty = new Kitty();
        PygmyMarmoset marmoset = new PygmyMarmoset();

        QueueTees queue = new QueueTees();

        System.out.println("Initial size: " + queue.size());

        queue.enqueue(puppy);
        queue.enqueue(kitty);
        queue.enqueue(marmoset);

        System.out.println("Size after enqueuing: " + queue.size());

        System.out.println("Dequeued: " + queue.dequeue().description());
        System.out.println("Dequeued: " + queue.dequeue().description());
        System.out.println("Dequeued: " + queue.dequeue().description());

        System.out.println("Final size: " + queue.size());
        queue.enqueue(puppy);
        System.out.println("Size after enqueueing one: " + queue.size());
        queue.clear();
        System.out.println("Size after clear: " + queue.size());
    }
}
