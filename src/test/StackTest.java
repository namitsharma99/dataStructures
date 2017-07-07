package test;

public class StackTest {

  public static void main(String[] args) {

    Stack stack = new StackTest().new Stack(10);
    System.out.println("Just created a stack of size limit - 10");
    System.out.println("Pushing -- 1");
    stack.push(1);
    System.out.println("Pushing -- 2");
    stack.push(2);

    System.out.println("Peeking - " + stack.peek());
    System.out.println("Is empty ? - " + stack.isEmpty());
    System.out.println("Is full ? " + stack.isFull());

    for (int i = 10; i < 20; i++) {
      System.out.println("Pushing -- " + i);
      if (!stack.isFull()) {
        System.out.println("Push successful!");
        stack.push(i);
      } else {
        System.out.println("Push failed since stack is full!");
      }
    }

    System.out.println("Popping -- " + stack.pop());
    System.out.println("Now stack should not be full, right? " + !stack.isFull());

    System.out.println("Let's empty the stack now!");
    while (!stack.isEmpty()) {
      System.out.println("Just popped out - " + stack.pop());
    }
    System.out.println("Is stack empty now ? " + stack.isEmpty());
    System.out.println("Silly question, but is it full :P  ? " + stack.isFull());
  }

  public class Stack {
    private int[] arrStack;
    private int top;
    private int sizeLimit;

    public Stack(int size) {
      arrStack = new int[size];
      top = -1;
      sizeLimit = size;
    }

    public void push(int element) {
      arrStack[++top] = element;
    }

    public int pop() {
      return arrStack[top--];
    }

    public int peek() {
      return arrStack[top];
    }

    public boolean isEmpty() {
      if (top == -1)
        return true;
      else
        return false;
    }

    public boolean isFull() {
      if (top == sizeLimit - 1)
        return true;
      else
        return false;
    }
  }

}
