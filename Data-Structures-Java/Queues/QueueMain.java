public class QueueMain {
    public static void main(String[] args) {
        JavaQueue queue = new JavaQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Front element is: " + queue.peekfront());
        queue.dequeue();
        System.out.println("Front element after dequeue is: " + queue.peekfront());
        System.out.println("Front element is: " + queue.peekfront());
    }
}