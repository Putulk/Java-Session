public class Queue {
    static int n=8;
    int items[] = new int[n];
    int front, rear;

    Queue() {
        front = -1;
        rear = -1;
    }

    boolean isFull() {
        if (front == 0 && rear == n - 1) {
            return true;
        }
        return false;
    }

    boolean isEmpty() {
        if (front == -1)
            return true;
        else
            return false;
    }

    // insert elements to the queue
    void enQueue(int element) {

        if (isFull()) {
            System.out.println("Queue is full");
        }
        else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            items[rear] = element;
            System.out.println("Insert " + element);
        }
    }

    // delete element from the queue
    int deQueue() {
        int element;

        if (isEmpty()) {
            System.out.println("Queue is empty");
            return (-1);
        }
        else {
            element = items[front];

            if (front >= rear) {
                front = -1;
                rear = -1;
            }
            else {
                front++;
            }
            System.out.println( element + " Deleted");
            return (element);
        }
    }

    // display element of the queue
    void display() {
        int i;
        if (isEmpty()) {
            System.out.println("Empty Queue");
        }
        else {
            System.out.println("\nFront index is-> " + front);

            System.out.println("Items are -> ");
            for (i = front; i <= rear; i++)
                System.out.print(items[i] + "  ");

            System.out.println("\nRear index is-> " + rear);
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.deQueue();

        for(int i = 0; i < n; i ++) {
            q.enQueue(i);
        }

        q.enQueue(6);

        q.display();

        q.deQueue();

        q.display();

    }
}
