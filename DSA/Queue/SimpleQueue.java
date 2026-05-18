package DSA.Queue;

public class SimpleQueue {
    int[] arr = new int[100];
    int front = -1;
    int rear = -1;
    int size = 99;

    void enqueue(int v) {
        if (rear == -1) {
            front++;
            arr[++rear]=v;

        } else if (front == size) {
            System.out.println("overflow");
            return;
        }
        else
        arr[++rear] = v;
    }

    void dequeue() {
        if (front == -1) {
            System.out.println("underflow");
            front = rear = -1;
        } else if(front == rear) {
            System.out.println("value Deleted " + arr[front]);
                 front = rear = -1;
        }else
            System.out.println("value deleted " + arr[rear--]);
    }

    void print() {
        for (int i = front; i <= rear; i++) {
            System.out.println("value is " + arr[i]);
        }

    }
}
