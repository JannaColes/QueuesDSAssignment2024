package Queues;

public class QueueArray<T> {
    private T[] arr;
    private int backOfQueue;
    private int beginningOfQueue;
    private int nItems;
    private int size;

    @SuppressWarnings("unchecked")
    public QueueArray(int size) {
        this.size = size;
        this.arr = (T[]) new Object[size];
        this.backOfQueue = -1;
        this.beginningOfQueue = -1;
        this.nItems = 0;
        System.out.println("The Queue is successfully created with size of: " + size);
    }

    public boolean isFull() {
        return nItems == size;
    }

    public boolean isEmpty() {
        return nItems == 0;
    }

    public void enqueue(T value) {
        if (isFull()) {
            System.out.println("The Queue is Full");
        } else if (isEmpty()) {
            beginningOfQueue = 0;
            backOfQueue++;
            nItems++;
            arr[backOfQueue] = value;
            System.out.println("Successfully inserted " + value + " in the queue");
        } else {
            backOfQueue = (backOfQueue + 1) % size;
            nItems++;
            arr[backOfQueue] = value;
            System.out.println("Successfully inserted " + value + " in the queue");
        }
    }

    public T dequeue() {
        if (isEmpty()) {
            System.out.println("The queue is empty");
            return null;
        } else {
            T result = arr[beginningOfQueue];
            beginningOfQueue = (beginningOfQueue + 1) % size;
            nItems--;
            return result;
        }
    }

    public T peek() {
        if (!isEmpty()) {
            return arr[beginningOfQueue];
        } else {
            System.out.println("The Queue is empty");
            return null;
        }
    }

    public void deleteQueue() {
        arr = null;
        System.out.println("The queue is successfully deleted");
    }
}

