/*
 * Given the root node to a singly linked list, write an algorithm to detect
 * if there is a loop in the list.
 */
public class LoopLinkedList {
	static class Node{
		Node next;
	}
	// time complexity: O(n)
	// space complexity: O(2)
	static boolean isLoopLinkedList(Node root){
		Node nodeIndex1 = root;
		Node nodeIndex2 = root;
		while(nodeIndex2.next != null){
			nodeIndex1 = nodeIndex1.next;
			nodeIndex2 = nodeIndex2.next.next;
			if(nodeIndex1 == nodeIndex2){
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args){
		Node n1 = new Node();
		Node n2 = new Node();
		Node n3 = new Node();
		Node n4 = new Node();
		Node n5 = new Node();
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n4;
		
		if(isLoopLinkedList(n1)){
			System.out.println("It is a loop linkedlist");
		}else{
			System.out.println("It is not a loop linkedlist");			
		}
	}
}
