//LinkedList implementation
//node structure
class Node {
    int data;
    Node next;
};

class LinkList {
  Node head;

LinkList(){
    head = null;
  }

//Adding new element at start of the LinkedList
  void add_front(int Element) {
    Node newNode = new Node();
    newNode.data = Element;
    newNode.next = head; 
    head = newNode;   
  }
//Adding new element at end of the LinkedList
  void add_back(int Element) {
    Node newNode = new Node();
    newNode.data = Element;
    newNode.next = null; 
    if(head == null) 
    {
      head = newNode;
    } 
    else 
    {
      Node temp = new Node();
      temp = head;
      while(temp.next != null)
        temp = temp.next;
      temp.next = newNode;
    }    
  }
//Adding a new element at the given position of the LinkedList
  void add_at(int Element, int position) {     
    Node newNode = new Node(); 
    newNode.data = Element;
    newNode.next = null;

    if(position < 0) {
      System.out.print("\n Position should be >= 0.");
    } 
    else if (position == 0) {
      newNode.next = head;
      head = newNode;
    } 
    else {
      Node temp = new Node();
      temp = head;
      for(int i = 0; i < position-1; i++) {
        if(temp != null) {
          temp = temp.next;
        }
      }
   
      if(temp != null) {
        newNode.next = temp.next;
        temp.next = newNode;  
      } else {
        System.out.print("\n Previous node is null.");
      }       
    }
  } 
 //Deleting the element at the first position
   void delete_front() {
    if(this.head != null) {
      Node temp = this.head;
      this.head = this.head.next;
      temp = null;  
    }
  }
 //Deleting the element at the Last position
  void delete_back() {
    if(this.head != null) {
      if(this.head.next == null) {
        this.head = null;
      } else {
        Node temp = new Node();
        temp = this.head;
        while(temp.next.next != null)
          temp = temp.next;
        Node lastnode = temp.next;
        temp.next = null; 
        lastnode = null;
      }
    }
  }
//Deleting the element at the Given position
   void delete_at(int position) {     
    if(position < 0) {
      System.out.print("\n Position should be >= 0.");
    } else if (position == 0 && head != null) {
      Node nodetodelete = head;
      head = head.next;
      nodetodelete = null;
    } else {
      Node temp = new Node();
      temp = head;
      for(int i = 0; i < position-1; i++) {
        if(temp != null) {
          temp = temp.next;
        }
      }
      if(temp != null && temp.next != null) {
        Node nodetodelete = temp.next;
        temp.next = temp.next.next; 
        nodetodelete = null; 
      } else {
        System.out.print("\n Node is already null.");
      }       
    }
  } 
   
//Counting the number of nodes by Traversing
   int Countnodes() {
    Node temp = new Node();
    temp = this.head;
    int i = 0;
    while(temp != null) {
      i++;
      temp = temp.next;
    }
    return i;  
  }  


//display the content of the list
  void Printelements() {
    Node temp = new Node();
    temp = this.head;
    if(temp != null) {
      System.out.print("List contains: ");
      while(temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.next;
      }
      System.out.println();
    } else {
      System.out.println("List is empty.");
    }
  }    
}


//Main class 
public class LinkedList { 
  public static void main(String[] args) {
    LinkList List = new LinkList();

    List.add_front(20);
    List.add_front(10);
    List.add_back(40);
    List.add_at(100, 2);
    List.add_at(60, 2);
    List.delete_front();
    List.delete_back();
    List.delete_at(1);
    List.Printelements();
    System.out.println("No. of nodes: "+ List.Countnodes()); 
    
  }
}