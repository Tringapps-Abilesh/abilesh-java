class Node1 {
    int data;
    Node1 next;
};

class LinkList1 {
  Node1 head;

LinkList1(){
    head = null;
  }

//Adding new element at start of the LinkedList
  void Push(int newElement) {
    Node1 newNode = new Node1();
    newNode.data = newElement;
    newNode.next = head; 
    head = newNode;   
  }
  
  void Pop() {
	    if(this.head != null) {
	      Node1 temp = this.head;
	      this.head = this.head.next;
	      temp = null;  
	    }
	  }
  //display the content of the list
  void Printelements() {
    Node1 temp = new Node1();
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
public class Stack { 
	  public static void main(String[] args) {
	    LinkList1 stack = new LinkList1();
	    stack.Push(20);
	    stack.Push(10);
	    stack.Push(40);
	    stack.Push(100);
	    stack.Pop();
	    stack.Pop();
	    stack.Printelements();	    
	  }
	}
