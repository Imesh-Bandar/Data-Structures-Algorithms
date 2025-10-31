public class JavaQueue {

    // initialize the variables for queue
    // [12,52,65,24]
    // rear front

    // front
    private int front;

    // reear
    private int reear;
    // maxsize
    private int MAXSIZE;
    // numIteam
    private int numberofIteam;
    // array
    private int QueueArray[];

    // constracture
    public JavaQueue(int sizeoftheQuearray) {
        this.MAXSIZE = sizeoftheQuearray;
        this.front = 0;
        this.reear = -1;
        this.numberofIteam = 0;
        this.QueueArray = new int[MAXSIZE];

    }

    // enqueue
    public void enqueue(int number) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + number);
        } else {
            reear = (reear + 1) % MAXSIZE;
            QueueArray[reear] = number;
            numberofIteam++;
        }
    }

    // dequeue
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Your Queue is empty nothing element to remove");
        } else {
            int removed = QueueArray[front];
            front = (front + 1) % MAXSIZE;
            numberofIteam--;
            System.out.println("Removed: " + removed);
        }
    }

    // peekfront
    public int peekfront() {
        return QueueArray[front];

    }

    // isFull
    public boolean isFull() {

        // queue is full when numberofIteam == MAXSIZE
        if (numberofIteam == MAXSIZE) {
            System.out.println("Your Queue is Full");
            return true;
        } else {

            return false;
        }
    }

    // isEmpty
    public boolean isEmpty() {
        // check numberof items ==0
        if (numberofIteam == 0) {

            return true;
        } else {
            System.out.println("Your Queue is not Empty have number of item" + numberofIteam);
            return false;

        }

    }

}
