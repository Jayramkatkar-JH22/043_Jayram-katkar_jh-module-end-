import java.util.*;
class Question2{
	
	Node head;
	int count=0;
	int i=5;
	public static class Node{
	
	Node next;
	int data;

	Node (int data){
	
	this.data=data;
	}
	}
	
	void addLast(int data){
		if(i==count)
		return;
		Node new_node=new Node(data);
		count++;
		if (head==null){
		head=new_node;
			
		return;
		}		
		
		Node trav= head;
		while (trav.next!=null){
		trav=trav.next;
		}
	
		trav.next=new_node;
	}
	 Node reverse(Node head){
	 Node trav= head.next;
	 Node prev=head;
	 Node cur=trav.next;
	 while (cur!=null){
		cur=trav.next;
		trav.next=prev;
		prev=trav;
		trav=cur;
		
		cur=cur.next;
		}
		head=trav;
		return head;
	 }
	void display(){
	Node trav=head;
	int a=0;
	while(trav!=null){
		a++;
	System.out.println(trav.data+" ");
	if (a==5)
		break;
	
	}
	}

	public static void main(String args[]){
	
	Question2 q=new Question2();
	q.addLast(1);
	q.addLast(2);
	q.addLast(3);
	q.addLast(4);
	q.addLast(5);
	q.head=q.reverse(q.head);
	q.display();
	
	
	
	}
}