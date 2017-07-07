package test;

public class QueueTest {

  public static void main(String[] args) {
    
    // a b c d e f g h i j k l m n
    Queue queue = new Queue();
    for (char i = 'A'; i< 'N'; i++) {
      System.out.println("Inserting "+i+" in the queue...");
      queue.insert(i);
    }
    
    System.out.println("After the inserts, size of the queue = "+queue.size);
    
    for (char i = 'A'; i< 'N'; i++) {
      System.out.println("Deleting from the queue...");
      System.out.println("Size of the remaining queue - "+queue.size);
      queue.remove();
    }
    
  }
  
  public static class Queue {
    private static int limit = 10;
    private char[] queueArr = new char[limit];
    private int front = 0;
    private int rear = -1;
    private int size = 0;
    
    public void insert(char c) {
      if (size == limit){
        System.out.println("Sorry, queue is full!");
      } else {
        queueArr[++rear]=c;
        size++;
        System.out.println("Insert successful!");
      }
    }
    
    public char remove() {
      if (size != 0) {
        System.out.println("Element removed - "+queueArr[front]);
        size--;
        return queueArr[front++];
      } else {
        System.out.println("Queue is empty!");
        return ' ';
      }
    }
    
    public char peek() {
      if (size != 0) {
        System.out.println("Element found - "+queueArr[front]);
        return queueArr[front];
      } else {
        System.out.println("Queue is empty!");
        return ' ';
      }
    }
  }

}
