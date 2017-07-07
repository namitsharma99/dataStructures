package test;

public class StackBracketTest {

  public static void main(String[] args) {

    String validExpression = "[a+{(b-c)*(d+e)}]";
    String invalidExpression = "[x+{y*z)]{hello}";

    letsCheck(validExpression);
    letsCheck(invalidExpression);
  }

  public static void letsCheck(String expression) {
    char[] validCharArr = expression.toCharArray();
    Stack stack = new StackBracketTest().new Stack(20);

    for (char c : validCharArr) {
      if (c == '[' || c == '{' || c == '(') {
        System.out.println("Found " + String.valueOf(c) + ", hence pushing");
        stack.push(c);
      } else if (!stack.isEmpty()) {
        if (c == ']' || c == '}' || c == ')') {
          if (c == ']' && stack.peek() == '[' || c == '}' && stack.peek() == '{' || c == ')' && stack.peek() == '(') {
            System.out.println("Found " + String.valueOf(c) + ", matched, hence popping - " + stack.pop());
          } else {
            System.out.println("Found " + String.valueOf(c) + ", unmatched!");
            System.out.println("Something is wrong!");
            return;
          }
        }

      }
    }
    System.out.println("Everything looks fine!");
  }

  public class Stack {
    private char[] arrStack;
    private int top;
    private int sizeLimit;

    public Stack(int size) {
      arrStack = new char[size];
      top = -1;
      sizeLimit = size;
    }

    public void push(char element) {
      arrStack[++top] = element;
    }

    public char pop() {
      return arrStack[top--];
    }

    public char peek() {
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
