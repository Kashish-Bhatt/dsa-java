import java.util.Scanner;

class MyCircularQueue {
    int front;
    int rear;
    int currsize;
    int k;
    int[] arr;

    public MyCircularQueue(int k) {
        this.k = k;
        arr = new int[k];
        front = 0;
        rear = -1;
        currsize = 0;
    }

    public boolean enQueue(int value) {

        if (currsize == k) {
            return false;
        }

        rear = (rear + 1) % k;
        arr[rear] = value;
        currsize++;

        return true;
    }

    public boolean deQueue() {

        if (currsize == 0) {
            return false;
        }

        front = (front + 1) % k;
        currsize--;

        return true;
    }

    public int Front() {

        if (currsize == 0) {
            return -1;
        }

        return arr[front];
    }

    public int Rear() {

        if (currsize == 0) {
            return -1;
        }

        return arr[rear];
    }

    public boolean isEmpty() {
        return currsize == 0;
    }

    public boolean isFull() {
        return currsize == k;
    }

    public void display() {

        if (currsize == 0) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.print("Queue: ");

        int i = front;

        for (int count = 0; count < currsize; count++) {
            System.out.print(arr[i] + " ");
            i = (i + 1) % k;
        }

        System.out.println();
    }
}

public class CircularQueue {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Queue Size: ");
        int size = sc.nextInt();

        MyCircularQueue q = new MyCircularQueue(size);

        q.enQueue(10);
        q.enQueue(20);
        q.enQueue(30);
        q.enQueue(40);
        q.enQueue(50);

        q.display();

        q.deQueue();
        q.deQueue();

        q.display();

        q.enQueue(60);
        q.enQueue(70);

        q.display();

        System.out.println("Front = " + q.Front());
        System.out.println("Rear = " + q.Rear());

        System.out.println("Is Empty: " + q.isEmpty());
        System.out.println("Is Full: " + q.isFull());

        sc.close();
    }
}