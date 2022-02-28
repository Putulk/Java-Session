import java.util.Scanner;
class Task
{
    String job;
    int priority;
    public Task(String job, int priority)
    {
        this.job = job;
        this.priority = priority;
    }
    public String toString()
    {
        return "Job Name : "+ job +"\nPriority : "+ priority;
    }
}
public class PriorityQueue {

    private Task[] queue;
    private int size, capacity;


    public PriorityQueue(int capacity)
    {
        this.capacity = capacity + 1;
        queue = new Task[this.capacity];
        size = 0;
    }

    public void clear()
    {
        queue = new Task[capacity];
        size = 0;
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

    public boolean isFull()
    {
        return size == capacity - 1;
    }

    public int size()
    {
        return size;
    }

    public void insert(String job, int priority)
    {
        Task newJob = new Task(job, priority);

        queue[++size] = newJob;
        int pos = size;
        while (pos != 1 && newJob.priority > queue[pos/2].priority)
        {
            queue[pos] = queue[pos/2];
            pos /=2;
        }
        queue[pos] = newJob;
    }

    public Task remove()
    {
        int parent, child;
        Task item, temp;
        if (isEmpty() )
        {
            System.out.println("Heap is empty");
            return null;
        }

        item = queue[1];
        temp = queue[size--];

        parent = 1;
        child = 2;
        while (child <= size)
        {
            if (child < size && queue[child].priority < queue[child + 1].priority)
                child++;
            if (temp.priority >= queue[child].priority)
                break;

            queue[parent] = queue[child];
            parent = child;
            child *= 2;
        }
        queue[parent] = temp;

        return item;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Priority Queue Test\n");

        System.out.println("Enter size of priority queue ");
        PriorityQueue pq = new PriorityQueue(scan.nextInt() );

        char ch;
        /*  Perform Priority Queue operations */
        do
        {
            System.out.println("\nPriority Queue Operations\n");
            System.out.println("1. insert");
            System.out.println("2. remove");
            System.out.println("3. check empty");
            System.out.println("4. check full");
            System.out.println("5. clear");
            System.out.println("6. size");

            int choice = scan.nextInt();
            switch (choice)
            {
                case 1 :
                    System.out.println("Enter job name and priority");
                    pq.insert(scan.next(), scan.nextInt() );
                    break;
                case 2 :
                    System.out.println("\nJob removed \n\n"+ pq.remove());
                    break;
                case 3 :
                    System.out.println("\nEmpty Status : "+ pq.isEmpty() );
                    break;
                case 4 :
                    System.out.println("\nFull Status : "+ pq.isFull() );
                    break;
                case 5 :
                    System.out.println("\nPriority Queue Cleared");
                    pq.clear();
                    break;
                case 6 :
                    System.out.println("\nSize = "+ pq.size() );
                    break;
                default :
                    System.out.println("Wrong Entry \n ");
                    break;
            }

            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);
        } while (ch == 'y'|| ch == 'Y');
    }
}
