class Node2 {
    int data;
    Node2 next;
};

class LinkList2 {
  Node2 head;

LinkList2(){
    head = null;
  }

//Adding new element at start of the LinkedList
  void enqueue(int newElement) {
    Node2 newNode = new Node2();
    newNode.data = newElement;
    newNode.next = head; 
    head = newNode;   
  }
  
  void dequeue() {
	    if(this.head != null) {
	      if(this.head.next == null) {
	        this.head = null;
	      } else {
	        Node2 temp = new Node2();
	        temp = this.head;
	        while(temp.next.next != null)
	          temp = temp.next;
	        Node2 lastnode = temp.next;
	        temp.next = null; 
	        lastnode = null;
	      }
	    }
	  }
  //display the content of the list
  void Printelements() {
    Node2 temp = new Node2();
    temp = this.head;
    if(temp != null) {
      System.out.print("The list contains: ");
      while(temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.next;
      }
      System.out.println();
    } else {
      System.out.println("The list is empty.");
    }
  } 
}
public class Queue { 
	  public static void main(String[] args) {
	    LinkList2 queue = new LinkList2();
	    queue.enqueue(28);
	    queue.enqueue(16);
	    queue.enqueue(42);
	    queue.enqueue(103);
	    queue.dequeue();
	    queue.dequeue();
	    queue.Printelements();	    
	  }
	}
