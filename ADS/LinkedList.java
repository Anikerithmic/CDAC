
class LinkedList{

	class Node{
		int data;
		Node next;

		Node(int data){
		data = d;
		next = null;
		}
	}
	
		void display(){
		Node n = head;

		while(n != null){
		System.out.print(n.data + "-->");
		n = n.next;
		}

	}
	
	void insertFirst(int newData){
		Node newNode = new Node(newData);
		newNode.next = head;
		head.next = newnode;
	}
	void insertAfter(Node prevNode, int newData){
		Node newNode = new Node(newData);
		newNode.next = prevNode.next;
		prevNode.next = newNode;
	}
	void insertLast(int newData){
		Node newNode = new Node(newData);
		if(head == null){
			head =  new Node(newData);
			return;
		}
		Node currNode = head;
		while(currNode.next != null){
			currNode = currNode.next;
		}
		currNode.next = newNode;
		return;
	}


	public static void main(String[] args){
		LinkedList l1 = new LinkedList();
		
		l1.head = new Node(10);
		l1.second = new Node(20);
		l1.third = new Node(30);
		l1.fourth = new Node(40);
		l1.fifth = new Node(50);
		l1.display();
	
	
	}
}