package test;

public class CircularQueueTest {

  public static void main(String[] args) {
    
    // a b c d e f g h i j k l m n
    Queue queue = new Queue();
    
    letsCheck(queue);
    
    for (char i = 'A'; i< 'G'; i++) {
      System.out.println("Inserting "+i+" in the queue...");
      queue.insert(i);
    }
    
    letsCheck(queue);
    
    for (char i = 'A'; i< 'C'; i++) {
      System.out.println("Deleting from the queue...");
      System.out.println("Size of the remaining queue - "+queue.size);
      queue.remove();
    }
    
    letsCheck(queue);
    
    for (char i = '1'; i< '6'; i++) {
      System.out.println("Inserting "+i+" in the queue...");
      queue.insert(i);
    }
    
    letsCheck(queue);
    
  }
  
  public static class Queue {
    private static int limit = 5;
    private char[] queueArr = new char[limit];
    private int front = 0;
    private int rear = 0;
    private int size = 0;
    
    public void insert(char c) {
      if (isFull()){
        System.out.println("Sorry, queue is full!");
      } else {
        if (rear == limit &&  front != 0){
          rear = -1;
          queueArr[++rear] = c;
        } else {
          queueArr[rear++]=c;
          size++;
        }
            
        System.out.println("Insert successful!");
      }
    }
    
    public char remove() {
      if (!isEmpty()) {
        System.out.println("Element removed - "+queueArr[front]);
        size--;
        return queueArr[front++];
      } else {
        System.out.println("Queue is empty!");
        return ' ';
      }
    }
    
    public char peek() {
      if (!isEmpty()) {
        System.out.println("Element found - "+queueArr[front]);
        return queueArr[front];
      } else {
        System.out.println("Queue is empty!");
        return ' ';
      }
    }
    
    public boolean isEmpty() {
      return size==0;
    }
    
    public boolean isFull() {
      return (rear==limit && front==0) || (rear == front-1);
    }
    
  }
  
  public static void letsCheck(Queue queue) {
    System.out.println("\n---------------------------------------------------");
    System.out.println("CheckPoint: let's check the parameters --");
    System.out.println("FRONT :"+queue.front);
    System.out.println("REAR  :"+(queue.rear-1));
    System.out.println("SIZE  :"+queue.size);
    System.out.println("EMPTY?:"+queue.isEmpty());
    System.out.println("FULL? :"+queue.isFull());
    System.out.println("---------------------------------------------------\n");
  }

}
