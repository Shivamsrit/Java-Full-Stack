package DSA.Queue.Queue;

public class main {
    public static void main(String[] args) {
        SimpleQueue q = new SimpleQueue();
        q.dequeue();
        q.enqueue(50);
        q.enqueue(60);
        q.enqueue(70);
        q.enqueue(80);
        q.print();
        q.dequeue();
        q.dequeue();
        q.dequeue();

        q.dequeue();
        

    }
}
