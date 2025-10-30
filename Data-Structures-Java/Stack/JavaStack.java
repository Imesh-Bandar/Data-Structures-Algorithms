public class JavaStack {

    // initialize stack variables
    // define max size for stack array
    private int MAXSIZE;
    // create an array to hold stack elements
    private int[] stackArray;
    // create a variable to track the top of the stack
    private int top;

    // create a constructor for JavaStack class
    public JavaStack(int sizeofStack) {
        // set the max size to the sizeOfStack parameter
        this.MAXSIZE = sizeofStack;
        // initialize the stack array with maxsize
        this.stackArray = new int[MAXSIZE];
        // set the top of the stack as -1 fro initial empty array
        this.top = -1;
    }

    // create push method to add elements to the stack
    public void push(int insertingvalue) {
        // need to check that is empty or full before pushing
        if (isFull()) {
            System.out.println("Cannot push to the array because stack is Full");
        } else {
            // increment the top and add the inserting value to the stack array
            stackArray[++top] = insertingvalue;
            System.out.println("pushed to the stack" + stackArray[top]);
        }
    }

    // create pop method to remove elements from the stack
    public int pop() {

        if (isEmpty()) {
            System.out.println("Cannot pop from the array because stack is Empty");
            return -1;
        } else {
            int pop = stackArray[top--];
            System.out.println("popped from the stack" + pop);
            return pop;
        }

    }

    // create peek method to view the top element of the stack without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty, nothing to peek");
            return -1;
        } else {
            System.out.println(stackArray[top]);
            return stackArray[top];
        }

    }

    // create isEmpty method to check if the stack is empty
    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    // create isFull method to check if the stack is full
    public boolean isFull() {
        if (top == MAXSIZE - 1) {
            return true;
        } else {
            return false;
        }
    }

}
