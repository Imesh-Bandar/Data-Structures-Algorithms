// Stack implementation in Java

public class StackMain{
    public static void main(String[] args) {
        System.out.println("Stack Implementation in Java");

        //create a stack of size 8
        JavaStack stackNew=new JavaStack(5);
        stackNew.push(10);
        stackNew.push(20);
        stackNew.push(30);
        stackNew.peek();
        stackNew.pop();
        stackNew.peek();


    }

}