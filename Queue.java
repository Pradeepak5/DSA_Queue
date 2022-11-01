import java.util.NoSuchElementException;
import java.util.Scanner;

public class Queue {
	
	private ListNode rear;
	private ListNode front;
	private int length;
	
	private class ListNode{
		private int data;
		private ListNode next;
		public ListNode(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	public Queue(){
		this.rear=null;
		this.front=null;
		this.length=0;
	}
	
	public int length() {
		return length;
	}
	
	public boolean isEmpty() {
		return length==0;
	}
	
	public void enQueue(int data) {
		ListNode temp=new ListNode(data);
		if(isEmpty()) {
			front=temp;
		}else {
			rear.next=temp;
		}
		rear=temp;
		length++;
	}
	
	public int deQueue() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		int result=front.data;
		front=front.next;
		if(front==null) {
			rear=null;
		}
		length--;
		return result;
	}
	
	public void display() {
		if(isEmpty()) {
			return;
		}
		ListNode current=front;
		while(current!=null) {
			System.out.print(current.data+" --> ");
			current=current.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		Queue q=new Queue();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of Queue : ");
		int sizeQueue=s.nextInt();
		for(int i=0;i<sizeQueue;i++) {
			System.out.println("Enter "+(i+1)+" Element : ");
			q.enQueue(s.nextInt());
		}
		q.display();
		q.deQueue();
		q.display();

	}

}
